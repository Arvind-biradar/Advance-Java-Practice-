import java.util.List;

public class Question {
	private String question;
	private List<option> option;
	public Question(String question) {
		super();
		this.question = question;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<option> getOption() {
		return option;
	}
	public void setOption(List<option> option) {
		this.option = option;
	}
	

}
