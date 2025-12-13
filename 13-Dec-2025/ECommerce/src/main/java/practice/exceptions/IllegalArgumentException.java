package practice.exceptions;

public class IllegalArgumentException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IllegalArgumentException(String string) {
		super(string);
	}

}
