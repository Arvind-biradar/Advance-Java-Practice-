package Intro;

import org.springframework.stereotype.Component;

@Component("area")
public class Area {

	public int calculateArea(int a,int b) {
		return a*b;
	}
	
	
}
