package Intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("checkarea")
public class AreaCalculate {

	@Autowired
	private Area area;

	
	public int checkArea(int a,int b) {
		System.out.println("Calculating Area ...");
	   return  area.calculateArea(a,b);
	}
	
	
}
