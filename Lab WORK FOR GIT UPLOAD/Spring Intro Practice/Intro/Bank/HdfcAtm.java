package Intro.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("hdfcAtm")
public class HdfcAtm implements Atm {

	
	@Autowired
	private Bank bank;

	public void withdraw(int amt) {
		System.out.println("Withdrawing Money At HDFC Atm"+ amt);
		bank.withdraw(amt);
		
	}
	
	
}
