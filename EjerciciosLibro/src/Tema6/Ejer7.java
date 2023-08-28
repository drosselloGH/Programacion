package Tema6;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase");
		String frase = sc.nextLine();

		System.out.println("Escribe una palabras que salga en la frase");
		String palabra = sc.nextLine();

		buscarPalabra(frase, palabra);

	}

	private static void buscarPalabra(String frase, String palabra) {

		int posPalabra = frase.indexOf(palabra);

		int vecesPalabra = 0;

		while (posPalabra != -1) {
			vecesPalabra++;
			posPalabra = frase.indexOf(palabra, posPalabra + 1);

		}

		if (vecesPalabra == 0) {
			System.out.println("La palabra no aparece en la frase");
		} else {
			System.out.println("La palabra aparece " + vecesPalabra + " veces");
		}

	}

}
