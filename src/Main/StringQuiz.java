package Main;

import java.util.Scanner;

public class StringQuiz {

	private StringSpecifications wishedString;
	private Scanner scanner;
	
	public StringQuiz(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public StringSpecifications startQuiz() throws Exception {
		if(this.doAllQuestions()) {
		return this.wishedString;
		}
		return null;
	}

	private boolean doAllQuestions() throws Exception {
		this.wishedString = new StringSpecifications();
		this.question1();
		return true;
	}
	
	private int question1() throws Exception {
		int minString = 0;
		
		System.out.println("enter the minimum string length");
			minString = scanner.nextInt();
			if(minString < 0) {
				throw new Exception("Invalid minimum string length");
			}
			this.wishedString.setMinString(minString);
			return minString;
	}
}
