/**
 * 
 */
package com.javaspring.aspects;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Raviteja
 *
 */

@Aspect
public class TrackCounter {
	private Map<Integer, Integer> trackCounts = new HashMap();
	
	@Pointcut("execution(* com.javaspring.javaconfig.CompactDisc.playTrack(int)) && args(trackNumber)")
	public void trackPlayed(int trackNumber){}
	
	@Before("trackPlayed(trackNumber)")
	public void countTrack(int trackNumber){
		int currentCount = getPlayCount(trackNumber);
		trackCounts.put(trackNumber, currentCount+1);
	}

	/**
	 * @param trackNumber
	 * @return
	 */
	public int getPlayCount(int trackNumber) {
		return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber): 0;
	}
}
