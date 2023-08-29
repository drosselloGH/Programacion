package Tema6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer11 {

	/**
	 * 
	 * Convierte una cadena en otra, usando los conjuntos de caracteres
	 * proporcionados
	 * 
	 * Se intercambian las letras de una cadena pasada del conjunto1 a conjunto2
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		System.out.println(Arrays.toString(conjunto1));
		System.out.println(Arrays.toString(conjunto2));

		System.out.println("Escribe una frase (se traducirá del conjunto1 al conjunto2");
		String frase = sc.nextLine();
		frase = frase.toLowerCase();

		// donde guardaremos los caracteres correspondientes
		String nuevaFrase = "";

		for (int i = 0; i < frase.length(); i++) {
			nuevaFrase += codifica(conjunto1, conjunto2, frase.charAt(i));
		}
		
		System.out.println(nuevaFrase);

	}

	private static char codifica(char[] conjunto1, char[] conjunto2, char c) {

		// convertimos el array de char en una cadena, para facilitar la busqueda
		String conj1 = String.copyValueOf(conjunto1);

		int posicion = conj1.indexOf(c);

		// si el caracter se encuentra en el conjunto1
		if (posicion != -1) {
			// se devuelve el caracter con la misma posicion del conjunto2
			return conjunto2[posicion];
		}
		// si no se encuentra el caracter en el conjunto2, se devuelve el caracter
		// pasado como parametro
		return c;

	}

}
