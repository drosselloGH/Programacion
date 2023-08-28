package Tema6;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase");
		String frase = sc.nextLine();

		System.out.println("La frase tiene " + contarEspacios(frase) + " espacios");
		
		frase = frase.strip();

		System.out.println(frase);
		
	}

	private static int contarEspacios(String frase) {
		
		if(frase.charAt(0) == ' ') {
			System.out.println("Reconstruyendo frase...");
			frase = frase.strip();
		}
		
		int cantEspacios = 0;

		for (int i = 0; i < frase.length(); i++) {
			// recordemos que cada letra de un String ("") es un char ('')
			if (frase.charAt(i) == ' ') {
				cantEspacios++;
			}
		}

		return cantEspacios;

	}

}
