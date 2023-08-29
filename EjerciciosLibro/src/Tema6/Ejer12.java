package Tema6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer12 {

	/**
	 * 
	 * Anagrama
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una palabra: ");
		String palabra1 = sc.nextLine();

		System.out.println("Escribe otra palabra: ");
		String palabra2 = sc.nextLine();

		if (esAnagrama(palabra1, palabra2)) {
			System.out.println("Es anagrama");
		} else {
			System.out.println("No es anagrama");
		}

	}

	private static boolean esAnagrama(String palabra1, String palabra2) {
		palabra1 = palabra1.toLowerCase();
		palabra2 = palabra2.toLowerCase();

		// si tienene una diferente longitud no son anagramas
		if (palabra1.length() != palabra2.length()) {
			return false;
		}

		// convertimos las palabras en un array de letras
		char p1[] = palabra1.toCharArray();
		char p2[] = palabra2.toCharArray();

		// ordenamos los arrays
		Arrays.sort(p1);
		Arrays.sort(p2);

		/**
		 * Una vez ordenados, los comparamos. Si son iguales, es que son anagramas,
		 * sino, no lo son
		 */
		if (Arrays.equals(p1, p2)) {
			return true;
		}

		return false;

	}

}
