package Intro.Bank1;

import org.springframework.stereotype.Component;

@Component("Axix1")
public class Axix1 implements Bank1 {
	
	public boolean isPresent(int accNo) {
		if(accNo==101010) {
			return true;
		}
		return false;
	}
	public void withdraw(int amt) {
		System.out.println("Acc Is From AXIX Bank  WIthdrawn Amount"+amt);
	}

}
