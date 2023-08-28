package Tema6;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String cadena = "", palabra;

		System.out.println("Escribe una palabra");
		palabra = sc.nextLine();

		while (!palabra.toLowerCase().equals("fin")) {
			cadena += palabra + " ";

			System.out.println("Escribe una palabra");
			palabra = sc.nextLine();

		}

		System.out.println(cadena);

	}

}
