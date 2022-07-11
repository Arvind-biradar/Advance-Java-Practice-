package Intro.Bank1;

import org.springframework.stereotype.Component;

@Component("HdfcBank1")
public class HdfcBank1 implements Bank1 {

	
	public boolean isPresent(int accNo) {
		if(accNo==202020) {
			return true;
		}
		return false;
	}
	public void withdraw(int amt) {
		System.out.println("Acc Is From HDFC Bank  WIthdrawn Amount"+amt);
	}

}
