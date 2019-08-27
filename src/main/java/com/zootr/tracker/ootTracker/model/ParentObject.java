package com.zootr.tracker.ootTracker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParentObject {

	private EntranceParent entrances;
	private LocationParent locations;

	public ParentObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EntranceParent getEntrances() {
		return entrances;
	}

	public void setEntrances(EntranceParent entrances) {
		this.entrances = entrances;
	}

	public LocationParent getLocations() {
		return locations;
	}

	public void setLocations(LocationParent locations) {
		this.locations = locations;
	}

}
