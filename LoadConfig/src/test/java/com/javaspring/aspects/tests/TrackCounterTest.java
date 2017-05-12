/**
 * 
 */
package com.javaspring.aspects.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javaspring.aspects.TrackCounter;
import com.javaspring.aspects.TrackCounterConfig;

/**
 * @author Raviteja
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {
	
	@Autowired
	private com.javaspring.javaconfig.CompactDisc cd;
	
	@Autowired
	private TrackCounter counter;
	
	@Test
	public void testTrackCounter(){
		cd.playTrack(1);
		
		assertEquals(1, counter.getPlayCount(1));
	}
}
