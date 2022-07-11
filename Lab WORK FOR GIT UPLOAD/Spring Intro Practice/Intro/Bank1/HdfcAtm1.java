package Intro.Bank1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfcAtm1")
public class HdfcAtm1 implements Atm1 {
	
	    @Autowired
	    private List<Bank1> bank;
	
   public void withdraw(int amt,int accNo) {
	   System.out.println("AMount"+amt+" Acc  No"+accNo);
        Bank1 presentBank=null;
	    for(Bank1 b:bank){
	    	
	      if (b.isPresent(accNo)){ 
	    	  presentBank=b;
   	      }
	    }
	    presentBank.withdraw(amt);
	    }
	

	
   }
   

