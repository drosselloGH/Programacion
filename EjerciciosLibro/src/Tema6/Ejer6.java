package Tema6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe tu nombre completo");
		String nombre = sc.nextLine();

		System.out.println(separarNombre(nombre));

	}

	private static String separarNombre(String nombre) {

		String combinacion = "";

		char c;

		for (int i = 0; i < nombre.length(); i++) {

			c = nombre.charAt(i);

			if (!esVocal(c)) {
				combinacion += c;
			}
		}

		return combinacion;

	}

	private static boolean esVocal(char c) {

		String vocales = "aáeéiíoóuú";

		c = Character.toLowerCase(c);

		if (vocales.indexOf(c) == -1) {
			return false;
		} else {
			return true;
		}

	}

}
