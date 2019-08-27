package com.zootr.tracker.ootTracker.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
import com.zootr.tracker.ootTracker.model.Location;
import com.zootr.tracker.ootTracker.model.ParentObject;

@Controller
public class EntranceTrackerController {
	
	private ObjectMapper objMapper = new ObjectMapper();
	private static final String JSON_FILE_NAME = "src/main/resources/static/entrances.json";
	private EntranceTracker tracker = EntranceTracker.getInstance();
	
	@RequestMapping("/list-entrances")
	public ModelAndView listEntrances() {
		ModelAndView mv = new ModelAndView("index");
		try {
			ParentObject parent = objMapper.readValue(new File(JSON_FILE_NAME), ParentObject.class);
			ArrayList<Entrance> dungeonEntrances = parent.getEntrances().getDungeons();
			ArrayList<Location> dungeonNames = parent.getLocations().getDungeons();
			ArrayList<Entrance> grottoEntrances = parent.getEntrances().getGrottos();
			ArrayList<Location> grottoNames = parent.getLocations().getGrottos();
			ArrayList<Entrance> buildingEntrances = parent.getEntrances().getIndoors();
			ArrayList<Location> buildingNames = parent.getLocations().getIndoors();
			
			mv.addObject("dungeonEntrances", dungeonEntrances);
			mv.addObject("dungeonNames", dungeonNames);
			mv.addObject("grottoEntrances", grottoEntrances);
			mv.addObject("grottoNames", grottoNames);
			mv.addObject("buildingEntrances", buildingEntrances);
			mv.addObject("buildingNames", buildingNames);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File not found");
		}
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("tracker");
	}
	
	@RequestMapping("/set-rules")
	public ModelAndView setRules(@RequestParam("rules") EntranceRuleSet rules) {
		tracker.setRules(rules);
		System.out.println(tracker.getRules());
		return new ModelAndView("redirect:/");
	}
}
