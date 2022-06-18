package Main;

public class StringQuiz {

	private StringSpecifications wishedString;

	public StringSpecifications startQuiz() {
		this.doAllQuestions();
		return this.wishedString;
	}

	private boolean doAllQuestions() {
		this.wishedString = new StringSpecifications();
		this.question1();
		return true;
	}
	
	private boolean question1() {
		return true;
	}
}
