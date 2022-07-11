
import java.util.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/QuestionloaderServlet")
public class QuestionloaderServlet extends HttpServlet {
  /* int	ino=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionBankLoader qbloader=new QuestionBankLoader();
		
		List<Question> questionlist=qbloader.questionBankLoadOn();
		
		
		Question  question =questionlist.get(ino);
		
		
		HttpSession session=request.getSession();
		session.setAttribute("currentQs",question);
		
		response.sendRedirect("viewQuestion1.jsp");
		
		
		
		
		
	}*/
		int qNo = 0;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			QuestionBankLoader qbLoader = new QuestionBankLoader();
			List<Question> questions = qbLoader.questionBankLoadOn();
			
		//	if(qNo < questions.size()) {
				Question question = questions.get(qNo++);
				
				HttpSession session = request.getSession();
				session.setAttribute("currentQs", question);
				
				response.sendRedirect("viewQuestion1.jsp");
			}
			//else
		//		response.sendRedirect("viewScore.jsp");
	//	}


}
