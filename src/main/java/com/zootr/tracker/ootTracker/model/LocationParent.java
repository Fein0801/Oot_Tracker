package com.zootr.tracker.ootTracker.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationParent {

	private ArrayList<Location> dungeons;
	private ArrayList<Location> grottos;
	private ArrayList<Location> indoors;
	private ArrayList<Location> overworld;

	public LocationParent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Location> getDungeons() {
		return dungeons;
	}

	public void setDungeons(ArrayList<Location> dungeons) {
		this.dungeons = dungeons;
	}

	public ArrayList<Location> getGrottos() {
		return grottos;
	}

	public void setGrottos(ArrayList<Location> grottos) {
		this.grottos = grottos;
	}

	public ArrayList<Location> getIndoors() {
		return indoors;
	}

	public void setIndoors(ArrayList<Location> indoors) {
		this.indoors = indoors;
	}

	public ArrayList<Location> getOverworld() {
		return overworld;
	}

	public void setOverworld(ArrayList<Location> overworld) {
		this.overworld = overworld;
	}

}
