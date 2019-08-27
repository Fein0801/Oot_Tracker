package com.zootr.tracker.ootTracker;

import com.zootr.tracker.ootTracker.model.EntranceRuleSet;

public class EntranceTracker {

	private static EntranceTracker tracker;
	private EntranceRuleSet rules;

	private EntranceTracker() {
	}

	public static EntranceTracker getInstance() {
		if (tracker == null) {
			tracker = new EntranceTracker();
		}
		return tracker;
	}

	public EntranceRuleSet getRules() {
		return rules;
	}

	public void setRules(EntranceRuleSet rules) {
		this.rules = rules;
	}
}
