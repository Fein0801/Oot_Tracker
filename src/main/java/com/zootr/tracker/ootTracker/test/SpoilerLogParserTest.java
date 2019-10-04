package com.zootr.tracker.ootTracker.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpoilerLogParserTest {

	@Test
	public void testData() {
		String expected = "FAZU0APLEW";
		String actual = ":seed";
		assertEquals("Data parsing does not match", expected, actual);
	}
}
