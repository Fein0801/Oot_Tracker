package com.zootr.tracker.ootTracker.controller;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zootr.tracker.ootTracker.EntranceTracker;
import com.zootr.tracker.ootTracker.model.Entrance;
import com.zootr.tracker.ootTracker.model.EntranceRuleSet;
import com.zootr.tracker.ootTracker.model.ListShrinker;
import com.zootr.tracker.ootTracker.model.Location;
import com.zootr.tracker.ootTracker.model.ParentObject;

@Controller
public class EntranceTrackerController {

	private ObjectMapper objMapper = new ObjectMapper();
	private static final String JSON_FILE_NAME = "src/main/resources/static/entrances.json";
	private EntranceTracker tracker = EntranceTracker.getInstance();

	private List<Entrance> dungeonEntrances;
	private List<Location> dungeonNames;
	private List<Entrance> grottoEntrances;
	private List<Location> grottoNames;
	private List<Entrance> buildingEntrances;
	private List<Location> buildingNames;

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
		ModelAndView mv = new ModelAndView("tracker");
		try {
			ParentObject parent = objMapper.readValue(new File(JSON_FILE_NAME), ParentObject.class);
			dungeonEntrances = parent.getEntrances().getDungeons();
			Collections.sort(dungeonEntrances);
			dungeonNames = parent.getLocations().getDungeons();
			Collections.sort(dungeonNames);
			grottoEntrances = parent.getEntrances().getGrottos();
			Collections.sort(grottoEntrances);
			grottoNames = parent.getLocations().getGrottos();
			Collections.sort(grottoNames);
			grottoNames = ListShrinker.trimGrottoList(grottoNames);
			buildingEntrances = parent.getEntrances().getIndoors();
			Collections.sort(buildingEntrances);
			buildingNames = parent.getLocations().getIndoors();
			Collections.sort(buildingNames);
			buildingNames = ListShrinker.trimGreatFairyLocations(buildingNames);

			if (rules == EntranceRuleSet.ALL_INDOORS || rules == EntranceRuleSet.ALL_OVERWORLD) {
				mv.addObject("grottoEntrances", grottoEntrances);
				mv.addObject("grottoNames", grottoNames);
				mv.addObject("buildingEntrances", buildingEntrances);
				mv.addObject("buildingNames", buildingNames);
				mv.addObject("indoors", 1);
			}
			mv.addObject("dungeonEntrances", dungeonEntrances);
			mv.addObject("dungeonNames", dungeonNames);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			mv.addObject("error", "Could not load data");
		}
		return mv;
	}
}
