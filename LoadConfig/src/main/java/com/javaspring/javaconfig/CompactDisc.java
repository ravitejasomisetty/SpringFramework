/**
 * 
 */
package com.javaspring.javaconfig;

/**
 * @author Raviteja
 *
 */
@org.springframework.stereotype.Component
public class CompactDisc {
	private String title = "The One";
	private String artist = "Backstreet Boys";
	
	public void play(){
		System.out.println("Playing: "+title+"by "+artist);
	}
	
	public void playTrack(int trackNumber){
		System.out.println("Playing: "+title+"by "+artist+"track: "+trackNumber);
	}
}
