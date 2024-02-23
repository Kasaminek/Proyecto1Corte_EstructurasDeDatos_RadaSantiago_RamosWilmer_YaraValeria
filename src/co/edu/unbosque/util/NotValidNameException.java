package co.edu.unbosque.util;

public class NotValidNameException extends Exception {
	private static final long serialVersionUID = 1L;

	public NotValidNameException() {
		super("El nombre ingresado no puede tener simbolos o numeros.");
	}

	public NotValidNameException(String mesage) {
		super(mesage);
	}
}