import java.util.*;

public class QuestionBankLoader {

	public List<Question> questionBankLoadOn(){
		
		
		QuestionBank questionbank=new QuestionBank();
//		questionbank.addSubject("JAVA");
		
		Question questions=new Question("What is JVM");
		List<option> oop=new ArrayList<>();
		oop.add(new option("Java vessel machine",false));
		oop.add(new option("Java vender machine",false));
		oop.add(new option("Java vision machine",false));
		oop.add(new option("Java vartual machine",true));
		questions.setOption(oop);
		questionbank.addQuestion("JAVA",questions);
		
		questions=new Question("What is JRE");
		oop=new ArrayList<>();
		
		oop.add(new option("Java Runner Equipment",false));
		oop.add(new option("Java Resional Environment",false));	
		oop.add(new option("Java RunnTime Environment",true));
		oop.add(new option("Java Run Enviornment",false));
		questions.setOption(oop);
		questionbank.addQuestion("JAVA", questions);
		
		
		
		
		
		
		questions=new Question("What is JIT complier");
		oop=new ArrayList<>();		
		oop.add(new option("Just In Time ",true));
		oop.add(new option("Java In Time",false));	
		oop.add(new option("Java In Timmer",false));
		oop.add(new option("Just in Timmer",false));		
		questions.setOption(oop);
		questionbank.addQuestion("JAVA", questions);
		
		

		questions=new Question("What is Collection");
		oop=new ArrayList<>();		
		oop.add(new option("Set is set of Object ",true));
		oop.add(new option("Set of instruments",false));	
		oop.add(new option("Set of quipments",false));
		oop.add(new option("Set of keywords",false));		
		questions.setOption(oop);
		questionbank.addQuestion("JAVA", questions);
		
		
		
		questions=new Question("What is True about Array");
		oop=new ArrayList<>();		
		oop.add(new option("Array is collection only primitive datatype element ",false));
		oop.add(new option("Array is similar datatype element",true));	
		oop.add(new option("Array can store nonsimilar datatype element",false));
		oop.add(new option("Array Size can be Modified",false));		
		questions.setOption(oop);
		questionbank.addQuestion("JAVA", questions);
		return questionbank.fetchQuestionOn("JAVA");
		
	}
	
	
	
	
	
	
	
	
}
