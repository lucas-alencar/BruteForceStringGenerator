package Main;

public class Executor {
	private StringSpecifications stringSpecifications;
	
	public boolean start() {
		return this.loop();
		}

	private boolean loop() {
		StringQuiz stringQuiz = new StringQuiz();
		this.stringSpecifications = stringQuiz.startQuiz();
		return true;
	}
	
}
