package com.zootr.tracker.ootTracker.model;

import java.util.ArrayList;
import java.util.List;

public abstract class ListShrinker {

	public static final int NUM_GREAT_FAIRIES = 6;

	public static List<Location> trimGrottoList(List<Location> grottoNames) {
		List<Location> results = new ArrayList<>();
		for (Location l : grottoNames) {
			if (!getFairyGrottos().contains(l.getName()) && !getGenericGrottos().contains(l.getName())
					&& !getScrubGrottos().contains(l.getName()) && !getScrubPotionGrottos().contains(l.getName())) {
				// Add the things
				results.add(l);
			}
		}
		results.add(new Location(LocationType.GROTTO, "Generic Grotto"));
		results.add(new Location(LocationType.GROTTO, "Fairy Fountain"));
		results.add(new Location(LocationType.GROTTO, "3 Scrub Grotto"));
		results.add(new Location(LocationType.GROTTO, "2 Scrub Grotto"));
		return results;
	}

	public static List<Location> trimGreatFairyLocations(List<Location> buildingNames) {
		List<Location> results = new ArrayList<>();
		for (Location l : buildingNames) {
			if (!l.getName().toLowerCase().contains("fairy")) {
				results.add(l);
			}
		}
		results.add(new Location(LocationType.INDOOR, "Great Fairy Fountain"));
		return results;
	}

	private static List<String> getFairyGrottos() {
		List<String> fairyFountains = new ArrayList<>();
		fairyFountains.add("Meadow Fairy Grotto");
		fairyFountains.add("Zoras Domain Storms Grotto");
		fairyFountains.add("Zoras River Bombable Grotto");
		fairyFountains.add("Field Far West Castle Town Grotto");
		return fairyFountains;
	}

	private static List<String> getGenericGrottos() {
		List<String> genericGrottos = new ArrayList<>();
		genericGrottos.add("Mountain Storms Grotto");
		genericGrottos.add("Top of Crater Grotto");
		genericGrottos.add("Kokiri Forest Storms Grotto");
		genericGrottos.add("Field Near Lake Outside Fence Grotto");
		genericGrottos.add("Lost Woods Generic Grotto");
		genericGrottos.add("Field West Castle Town Grotto");
		genericGrottos.add("Remote Southern Grotto");
		genericGrottos.add("Zora River Plateau Open Grotto");
		genericGrottos.add("Kakariko Back Grotto");
		return genericGrottos;
	}

	private static List<String> getScrubGrottos() {
		List<String> scrubGrottos = new ArrayList<>();
		scrubGrottos.add("Lake Hylia Grotto");
		scrubGrottos.add("Lon Lon Grotto");
		scrubGrottos.add("DMC Hammer Grotto");
		scrubGrottos.add("Goron City Grotto");
		return scrubGrottos;
	}

	private static List<String> getScrubPotionGrottos() {
		List<String> potionGrottos = new ArrayList<>();
		potionGrottos.add("Zora River Storms Grotto");
		potionGrottos.add("Lost Woods Sales Grotto");
		potionGrottos.add("Gerudo Valley Storms Grotto");
		return potionGrottos;
	}

	public static int getNumberOfGenericGrottos() {
		return getGenericGrottos().size();
	}

	public static int getNumberOfFairyGrottos() {
		return getFairyGrottos().size();
	}

	public static int getNumberOfScrubGrottos() {
		return getScrubGrottos().size();
	}
}
