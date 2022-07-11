package Intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MusicSystem")
public class MusicSystem {
	
	@Autowired
	private Song song;
	
	public void  play() {
		
		song.turnOn();
		song.turnOff();
	}
	

}
