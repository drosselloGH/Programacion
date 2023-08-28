package Tema6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer3b {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Jugador 1 escribe una frase:");
		String frase = sc.nextLine();
		// le quitamos los posibles espacios en blanco que pueda tener
		frase = frase.strip();

		System.out.println("La contraseña tiene " + frase.length() + " caracteres");

		System.out.println("Escribe la contraseña, Jugador 2");
		String respuesta = sc.nextLine();

		while (!respuesta.equals(frase)) {

			String pista = "";

			for (int i = 0; i < respuesta.length(); i++) {
				if (respuesta.charAt(i) == frase.charAt(i)) {
					pista += respuesta.charAt(i);
				} else {
					pista += "*";
				}
			}
			System.out.println(pista);
			System.out.println("Escribe la contraseña, Jugador 2");
			respuesta = sc.nextLine();
		}

		System.out.println("Correcto");

	}

}
