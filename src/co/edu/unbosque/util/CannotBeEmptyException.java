package co.edu.unbosque.util;

public class CannotBeEmptyException extends Exception {
	private static final long serialVersionUID = 1L;

	public CannotBeEmptyException() {
		super("No puede estar vacio.");
	}

	public CannotBeEmptyException(String message) {
		super(message);
	}
}