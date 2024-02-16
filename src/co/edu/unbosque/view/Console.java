package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner sc;

	public Console() {
		sc = new Scanner(System.in);
	}

	public void printSkip(String data) {
		System.out.println(data);
	}

	public void printNoSkip(String data) {
		System.out.print(data);
	}

	public int readInt() {
		return sc.nextInt();
	}

	public long readLong() {
		return sc.nextLong();
	}

	public float readFloat() {
		return sc.nextFloat();
	}

	public double readDouble() {
		return sc.nextDouble();
	}

	public char readChar() {
		return sc.next().charAt(0);
	}

	public String readWord() {
		return sc.next();
	}

	public String readWholeLine() {
		return sc.nextLine();
	}

	public void burnLine() {
		sc.nextLine();
	}
}