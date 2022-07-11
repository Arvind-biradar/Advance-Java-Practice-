package NewPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.cj.xdevapi.Statement;





@Component("bookinterface")
public class BookInterface implements BookStall {

	@Autowired
	private  DataSource dataSource;
	
	public List<Book> showAll(Book book1) {
//		Connection con=null;
//		try {
//			String url="jdbc:mysql://localhost:3306/demo";
//			String user="root";
//			String pass="cdac";
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			 con=DriverManager.getConnection(url,user,pass);
//			
//			Statement st=(Statement) con.createStatement();
//			
//			boolean emailexit=false;
//			
//			ResultSet s=((java.sql.Statement) st).executeQuery("select * from tabuser");
//		    
//		    
//		}catch (Exception e){
//			e.printStackTrace();
//		}
		return null;
	}


	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	
		
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 long t1=System.currentTimeMillis();
			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","cdac"); //normal jdbc Connection
			 con= dataSource.getConnection();
			 
			 long t2=System.currentTimeMillis();
			  System.out.println("Time 2 :"+(t2-t1));
		    PreparedStatement st=con.prepareStatement("insert into bookBank(bookName ,bookPrice,bookPages,bookAuthor) value(?,?,?,?)");
		st.setString(1,book.getBookName());
		st.setInt(2,book.getPrice());
		st.setInt(3,book.getPages());
		st.setString(4,book.getAuthor());
		st.executeUpdate();
		    
		    
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	

}
