package co.edu.unbosque.util;

public class NonExistentObjectListException extends Exception {
	private static final long serialVersionUID = 1L;

	public NonExistentObjectListException() {
		super("No puede estar vacia la lista.");
	}

	public NonExistentObjectListException(String message) {
		super(message);
	}
}