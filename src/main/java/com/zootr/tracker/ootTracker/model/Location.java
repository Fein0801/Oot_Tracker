package com.zootr.tracker.ootTracker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
	
	private EntranceType type;
	@JsonProperty("location")
	private String name;
	
	public Location() {
		super();
	}

	public EntranceType getType() {
		return type;
	}

	public void setType(EntranceType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}