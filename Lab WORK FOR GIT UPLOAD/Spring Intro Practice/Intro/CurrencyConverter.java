package Intro;

import org.springframework.stereotype.Component;

@Component("Converter")
public class CurrencyConverter {

	
	public float  covertCurrency(String from ,String to,float amount) {

		if(from.equals("USD" )&& to.equals("INR")) {
			return (float)78.98*amount;
		}else if(from.equals("INR" )&& to.equals("USD")) {
			return (float)(amount/78.98);
		}else 
			return 0;
		
	}
	
	
}
