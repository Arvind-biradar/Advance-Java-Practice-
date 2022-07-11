package Intro.Bank;

import org.springframework.stereotype.Component;

@Component("iciciBank")
public class IciciBank implements Bank {

	
	public void withdraw(int amt) {
		System.out.println("Withdrawing Money From ICICI BAnk"+ amt);
	}
}
