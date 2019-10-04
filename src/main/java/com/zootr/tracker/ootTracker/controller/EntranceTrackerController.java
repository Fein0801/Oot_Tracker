package com.zootr.tracker.ootTracker.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zootr.tracker.ootTracker.EntranceTracker;
import com.zootr.tracker.ootTracker.model.EntranceRuleSet;

@Controller
public class EntranceTrackerController {

	private ObjectMapper objMapper = new ObjectMapper();
	private static final String JSON_FILE_NAME = "src/main/resources/static/spoiler_log.json";
	private EntranceTracker tracker = EntranceTracker.getInstance();

	@RequestMapping("/list-entrances")
	public ModelAndView listEntrances() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@RequestMapping("/")
	public ModelAndView home() {
		if (tracker.getRules() == null) {
			tracker.setRules(EntranceRuleSet.DUNGEONS_ONLY);
		}
		return new ModelAndView("redirect:/tracker");
	}

	@RequestMapping("/set-rules")
	public ModelAndView setRules(@RequestParam("rules") EntranceRuleSet rules) {
		tracker.setRules(rules);
		System.out.println(tracker.getRules());
		return new ModelAndView("redirect:/tracker");
	}

	@RequestMapping("/tracker")
	public ModelAndView trackerMain() {
		EntranceRuleSet rules = tracker.getRules();
		ModelAndView mv = new ModelAndView("new-tracker");
		JsonFactory factory = new JsonFactory();
		try {
			JsonParser parser = factory.createParser(new File(JSON_FILE_NAME));
			parser.nextToken();
			int counter = 0;
			final int MAX_VAL = 15;
			while (parser.hasCurrentToken() && counter < MAX_VAL) {
				if (parser.currentToken().isStructStart() || parser.currentToken().isStructEnd()) {
					System.out.println(parser.currentToken().asString());
//					continue;
				} else if (parser.currentToken() == JsonToken.FIELD_NAME) {
					counter++;
					System.out.println("\'" + parser.getCurrentName() + "\' : " + parser.getCurrentValue());
				}
				parser.nextToken();
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

}
