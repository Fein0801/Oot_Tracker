package com.zootr.tracker.ootTracker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entrance {

	private EntranceType type;
	private String entrance;
	
	public Entrance() {
		super();
	}

	public EntranceType getType() {
		return type;
	}

	public void setType(EntranceType type) {
		this.type = type;
	}

	public String getEntrance() {
		return entrance;
	}

	public void setEntrance(String entrance) {
		this.entrance = entrance;
	}
	
}
