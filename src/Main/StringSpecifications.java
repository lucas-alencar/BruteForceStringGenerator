package Main;

public class StringSpecifications {

	private int minString;

	private int maxString;

	private boolean specialChars;

	public StringSpecifications() {
	}
	public StringSpecifications(boolean specialChars, int minString, int maxString) {
		this.minString = minString;
		this.maxString = maxString;
		this.specialChars = specialChars;
	}

}
