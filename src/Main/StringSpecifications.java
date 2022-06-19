package Main;

public class StringSpecifications {

	private int minString;

	public int getMinString() {
		return minString;
	}
	public void setMinString(int minString) {
		this.minString = minString;
	}
	public int getMaxString() {
		return maxString;
	}
	public void setMaxString(int maxString) {
		this.maxString = maxString;
	}
	public boolean isSpecialChars() {
		return specialChars;
	}
	public void setSpecialChars(boolean specialChars) {
		this.specialChars = specialChars;
	}
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
