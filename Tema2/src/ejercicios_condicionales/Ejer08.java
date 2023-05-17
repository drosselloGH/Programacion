package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cómo se dice \"ordenador\" en inglés?");
		
		String palabra = sc.nextLine();
		
		palabra = palabra.toUpperCase(); //convertimos la palabra en mayuscula
		
		if (palabra.equals("COMPUTER")) {
			System.out.println("Correcto");
		} else {
			System.out.println("Mal");
		}
		
	}

}
