package com.zootr.tracker.ootTracker.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntranceParent {

	private List<Entrance> dungeons;
	private List<Entrance> grottos;
	private List<Entrance> indoors;
	private List<Entrance> overworld;

	public EntranceParent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Entrance> getDungeons() {
		return dungeons;
	}

	public void setDungeons(List<Entrance> dungeons) {
		this.dungeons = dungeons;
	}

	public List<Entrance> getGrottos() {
		return grottos;
	}

	public void setGrottos(List<Entrance> grottos) {
		this.grottos = grottos;
	}

	public List<Entrance> getIndoors() {
		return indoors;
	}

	public void setIndoors(List<Entrance> indoors) {
		this.indoors = indoors;
	}

	public List<Entrance> getOverworld() {
		return overworld;
	}

	public void setOverworld(List<Entrance> overworld) {
		this.overworld = overworld;
	}

}
