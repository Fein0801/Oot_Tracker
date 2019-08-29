package com.zootr.tracker.ootTracker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location implements Comparable<Location>{
	
	private LocationType type;
	@JsonProperty("location")
	private String name;
	
	public Location() {
		super();
	}
	
	public Location(LocationType type, String name) {
		super();
		this.type = type;
		this.name = name;
	}

	public LocationType getType() {
		return type;
	}

	public void setType(LocationType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Location o) {
		return this.name.compareTo(o.getName());
	}	
}
