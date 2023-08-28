package Tema6;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase, y veremos si es palíndromo");
		String frase = sc.nextLine();
		
		String sinEspacios = reconstruirFrase(frase);
		String invertida = invertir(sinEspacios);
		
		System.out.println("Frase sin espacios: "+sinEspacios);
		System.out.println("Frase invertida: "+invertida);
		
		if(sinEspacios.equals(invertida)) {
			System.out.println("Es una frase palíndroma");
		} else {
			System.out.println("No es una frase palíndroma");
		}

	}

	/**
	 * 
	 * @param frase
	 * @return frase con los espacios en blanco eliminados
	 */
	private static String reconstruirFrase(String frase) {

		String sin = "";
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			// si el caracter no es un caracter en blanco
			if (!Character.isWhitespace(c)) {
				sin += c;
			}

		}

		return sin;

	}

	/**
	 * 
	 * @param cadena
	 * @return devuelve la cadena invertida
	 */
	private static String invertir(String cadena) {
		
		String cadenaInvertida = "";
		
		for (int i = cadena.length() -1; i >= 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		
		return cadenaInvertida;
	}

}
