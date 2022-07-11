package Intro;
import Intro.Bank.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("mySpring.xml");
		
	   Hello h=(Hello) ctx.getBean("hello");
	   System.out.println(h.sayHello("Arvind....."));
	   
	   Calculator c=(Calculator) ctx.getBean("cal");
	   System.out.println("Addition : " +c.add(12,48));
	   System.out.println("Subtraction : "+c.sub(12,48));
	   
	   CurrencyConverter cc=(CurrencyConverter) ctx.getBean("Converter");
	 
	  System.out.println( "USD in  Indian rupee " +cc.covertCurrency("INR","USD", 78.98f));
	  
	  
	  
	  AreaCalculate ac=(AreaCalculate) ctx.getBean("checkarea");
	  
	  System.out.println("Area is : "+ac.checkArea(12,10));
	  
	  MusicSystem ms=(MusicSystem) ctx.getBean("MusicSystem");
	  ms.play();
	  
	  Atm atm= (Atm) ctx.getBean("hdfcAtm");
	  atm.withdraw(5000);
		
		
	  
	}

}
