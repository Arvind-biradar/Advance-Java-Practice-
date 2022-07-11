package Intro;

import org.springframework.stereotype.Component;

@Component("Song")
public class Song {

	public void turnOn() {
		
		System.out.println("Music is ON Now....");
	}
public void turnOff() {
		
		System.out.println("Music is OFF Now....");
	}
}
