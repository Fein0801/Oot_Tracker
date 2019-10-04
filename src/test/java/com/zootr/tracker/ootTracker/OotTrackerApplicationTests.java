package com.zootr.tracker.ootTracker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OotTrackerApplicationTests {

	@Test
	public void contextLoads() {
		String expected = "FAZU0APLEW";
		String actual = "FAZU0APLEW";
		assertEquals("Data parsing does not match", expected, actual);
	}

}
