package com.zootr.tracker.ootTracker.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationParent {

	private List<Location> dungeons;
	private List<Location> grottos;
	private List<Location> indoors;
	private List<Location> overworld;

	public LocationParent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Location> getDungeons() {
		return dungeons;
	}

	public void setDungeons(List<Location> dungeons) {
		this.dungeons = dungeons;
	}

	public List<Location> getGrottos() {
		return grottos;
	}

	public void setGrottos(List<Location> grottos) {
		this.grottos = grottos;
	}

	public List<Location> getIndoors() {
		return indoors;
	}

	public void setIndoors(List<Location> indoors) {
		this.indoors = indoors;
	}

	public List<Location> getOverworld() {
		return overworld;
	}

	public void setOverworld(List<Location> overworld) {
		this.overworld = overworld;
	}

}
