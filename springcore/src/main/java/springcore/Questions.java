package springcore;

import java.util.List;
import java.util.Map;

public class Questions {
	
	String question;
	List<String> answers;
	Map<String,String> marks;
	
	public Map<String, String> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, String> marks) {
		this.marks = marks;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Questions [question=" + question + ", answers=" + answers + ", marks=" + marks + "]";
	}
	
	

}
