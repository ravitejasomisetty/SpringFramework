/**
 * 
 */
package com.javaspring.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Raviteja
 *
 */
@Component
public class CDPlayer {
	private CompactDisc cd;
	
	@Autowired
	public void setCD(CompactDisc cd){
		this.cd = cd;
	}
	
	public void play(){
		cd.play();
	}

	/**
	 * @return
	 */
	public CompactDisc getCD() {
		return this.cd;
	}
}
