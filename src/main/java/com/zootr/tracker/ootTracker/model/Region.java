package com.zootr.tracker.ootTracker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Region implements Comparable<Region> {

	private static final LocationType TYPE = LocationType.REGION;
	@JsonProperty("to")
	private String region;
	@JsonProperty("from")
	private String origin;

	public Region() {
		
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
	
	public LocationType getType() {
		return TYPE;
	}

	@Override
	public String toString() {
		return "" + region + " FROM " + origin;
	}

	@Override
	public int compareTo(Region o) {
		return this.region.compareTo(o.region);
	}
	
	

}
