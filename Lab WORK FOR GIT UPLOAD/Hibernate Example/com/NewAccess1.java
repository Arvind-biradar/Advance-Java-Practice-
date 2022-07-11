package com;

import java.time.*;
import java.time.LocalDate;

import java.util.List;

public class NewAccess1 {

	
	public static void main(String args[]) {
		
		NewAccess a=new NewAccess();
////		
//		a.setId(1006);
//		a.setAge(68);
//		a.setName("a");
//		a.setSalary(550000);
		EmployeeDeo e=new EmployeeDeo();
//		e.add(a);
//		NewAccess g=e.getFromId(1002);
//		List<NewAccess> s = e.getAll();
//		for(NewAccess f:s)
//		System.out.println(f.getAge()+" "+f.getId()+" "+f.getName()+" "+f.getSalary());
		
		List<NewAccess> s1 = e.getByName("sunil");
		for(NewAccess f:s1)
		System.out.println(f.getAge()+" "+f.getId()+" "+f.getName()+" "+f.getSalary());
	}
	
		
}
