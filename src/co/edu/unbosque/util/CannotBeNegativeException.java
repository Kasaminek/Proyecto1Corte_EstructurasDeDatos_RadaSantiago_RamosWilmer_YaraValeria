package co.edu.unbosque.util;

public class CannotBeNegativeException extends Exception {
	private static final long serialVersionUID = 1L;

	public CannotBeNegativeException() {
		super("El dato ingresado no puede ser negativo.");
	}

	public CannotBeNegativeException(String mesage) {
		super(mesage);
	}
}