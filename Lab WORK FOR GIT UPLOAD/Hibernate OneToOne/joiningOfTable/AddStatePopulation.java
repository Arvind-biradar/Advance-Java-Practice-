




/*Always   Start with Primary table Like the table have mappedBy is there ....add in this Teacher table  and then add in second table*/




package joiningOfTable;

public class AddStatePopulation {

	public static void main(String[] args) {
		
		
		population p=new population();
		p.setStatePin(111);
		p.setPopulation(5000);
		p.setFood("Bhakar");
		
	    
		state s=new state();
		s.setStateName("Maharastra");
		
		
		populationStateDao psd=new populationStateDao();
		psd.addp(p);
		psd.adds(s);
  
	}

}
