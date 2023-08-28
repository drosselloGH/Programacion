package Tema6;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase");
		String frase = sc.nextLine();

		System.out.println("Frase invertida: " + invertir(frase));

	}

	public static String invertir(String frase) {
		String fraseInvertida = "";

		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseInvertida += frase.charAt(i);
		}

		return fraseInvertida;
	}

}
