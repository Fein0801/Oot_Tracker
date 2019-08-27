package com.zootr.tracker.ootTracker.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntranceParent {

	private ArrayList<Entrance> dungeons;
	private ArrayList<Entrance> grottos;
	private ArrayList<Entrance> indoors;
	private ArrayList<Entrance> overworld;

	public EntranceParent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Entrance> getDungeons() {
		return dungeons;
	}

	public void setDungeons(ArrayList<Entrance> dungeons) {
		this.dungeons = dungeons;
	}

	public ArrayList<Entrance> getGrottos() {
		return grottos;
	}

	public void setGrottos(ArrayList<Entrance> grottos) {
		this.grottos = grottos;
	}

	public ArrayList<Entrance> getIndoors() {
		return indoors;
	}

	public void setIndoors(ArrayList<Entrance> indoors) {
		this.indoors = indoors;
	}

	public ArrayList<Entrance> getOverworld() {
		return overworld;
	}

	public void setOverworld(ArrayList<Entrance> overworld) {
		this.overworld = overworld;
	}

}
