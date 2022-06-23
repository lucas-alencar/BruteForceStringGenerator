package Main;

import java.util.Scanner;

public class StringQuiz {

	private StringSpecifications wishedString;
	private Scanner scanner;
	
	public StringQuiz(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public StringSpecifications startQuiz() throws Exception {
		if(this.doAllQuestions()) 
			return this.wishedString;
		
		return null;
	}

	private boolean doAllQuestions() throws Exception {
		this.wishedString = new StringSpecifications();
		this.questionMinStringLenght();
		this.questionMaxStringLenght();
		this.questionHasSpecialChars();
		return true;
	}
	
	private int questionMinStringLenght() throws Exception {
		int minString = 0;
		
		System.out.println("enter the minimum string length");
			minString = scanner.nextInt();
			if(minString < 0) {
				throw new Exception("Invalid minimum string length");
			}
			this.wishedString.setMinString(minString);
			return minString;
	}
	
	private int questionMaxStringLenght() throws Exception {
		int maxString = -1;
		
		System.out.println("enter the maximum string length");
			maxString = scanner.nextInt();
			if(maxString < 0) {
				throw new Exception("Invalid minimum string length");
			}
			this.wishedString.setMaxString(maxString);
			return maxString;
	}
	
	private boolean questionHasSpecialChars() throws Exception{
		System.out.println("do the password have special chars? (yes,no)");
		String hasSpecialChars = scanner.nextLine();
		if(hasSpecialChars == "yes") {
			this.wishedString.setSpecialChars(true);
			return true;
		}
		else if(hasSpecialChars == "no") {
			this.wishedString.setSpecialChars(false);
			return false;
		}
		else {
			throw new Exception("invalid answer special chars: "+hasSpecialChars);
		}
	}
}
