package com.zootr.tracker.ootTracker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Region {

	@JsonProperty("to")
	private String region;
	@JsonProperty("from")
	private String origin;

	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
