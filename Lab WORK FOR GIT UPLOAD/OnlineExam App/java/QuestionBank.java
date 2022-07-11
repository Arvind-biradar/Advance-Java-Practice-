import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class QuestionBank {

	private  Map<String, List<Question>> q=new HashMap<>();
	
	

	
	
	public void addQuestion(String subject,Question question) {
		q.put(subject,new ArrayList<>());
	List<Question> questions=q.get(subject);
	questions.add(question);
	}	
	
	public List<Question> fetchQuestionOn(String subject){
		return q.get(subject);
	}
	
}
