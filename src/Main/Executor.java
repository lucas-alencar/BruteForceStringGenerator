package Main;

import java.util.Scanner;

public class Executor {
	private Scanner scanner;
	private StringSpecifications stringSpecifications;
	private StringQuiz stringQuiz;
	private StringGenerator stringGenerator;
	
	public Executor(Scanner scanner) {
		this.scanner = scanner;
		this.stringGenerator = new StringGenerator();
	}
	
	public boolean start() throws Exception {
		return this.loop();
		}

	private boolean loop() throws Exception {
		stringQuiz = new StringQuiz(scanner);
		this.stringSpecifications = stringQuiz.startQuiz();
		this.stringGenerator.generate(this.stringSpecifications);
		return true;
	}
	
}
