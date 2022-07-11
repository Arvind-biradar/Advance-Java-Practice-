


/*Always   Start with Primary table Like the table have mappedBy is there ....add in this Teacher table  and then add in second table*/




package joinOfTable;

import java.util.List;

public class StateTin {

	public static void main(String[] args) {
		
//		Tin t=new Tin();
//		t.setStateCode("GA");
//		t.setTin(30);
//		
//		
//		
//	State s=new State();
//	s.setName("Goa");
//     s.setTin(t);

	StateTinDao std=new StateTinDao();
//	std.addt(t);
//	std.adds(s);
	
//	State s1=std.fetchState(1);
//	Tin t1=std.fetchTin(37);
	
//	s1.setTin(t1);
//	std.Update(s1);
	
	// To get the State By Char..
//	List<State> st=std.GetStateByChar("T");
//	for(State h:st) {
//		System.out.println(h.getNo()+" "+h.getName()+" ");
//	}	
	
//	List<State> st1=std.getByTinCode("DL");
//	
//	for(State h:st1) {
//		System.out.println(h.getNo()+" "+h.getName()+" ");
//	}	
//	
//	
//	List<Tin> st2=std.getTinCodeByStateName("Dehli");
//	for(Tin h:st2) {
//		System.out.println(h.getStateCode());	}	
	
		List<State> st3=std.getByTinCode("DL");

	for(State h:st3) {
		    System.out.println("                  "+h.getName()+" ");

           	}
	}
}
