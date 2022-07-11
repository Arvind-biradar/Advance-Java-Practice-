package NewPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext ctx=new ClassPathXmlApplicationContext("MySpringAndDataBase.xml");//Sytext with Xml file added
		BookStall bs=(BookStall) ctx.getBean("bookinterface");
		Book b=new Book();
//		
//		b.setBookName("The Wall -RahulDravid...");
//		b.setAuthor("Ashish Janjra");
//		b.setPages(1234);
//		b.setPrice(5001);
//		
Book b1=new Book();
		
		b1.setBookName("Master...");
		b1.setAuthor("Jain Antish");
		b1.setPages(345);
		b1.setPrice(1001);
//Book b3=new Book();
//		
//		b3.setBookName("Multan Ka Sultan...");
//		b3.setAuthor("Shiab Akhatar");
//		b3.setPages(789);
//		b3.setPrice(4001);
		
		
		
		try
		{
	   long t1=System.currentTimeMillis();
			bs.addBook(b1);
	   long t2=System.currentTimeMillis();
	   System.out.println("Time 1 :"+(t2-t1));
	    
		//  bs.addBook(b3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	

}
