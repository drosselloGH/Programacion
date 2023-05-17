package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String claveCorrecta = "java8";

		System.out.println("Escribe clave de acceso: ");
		String palabra = sc.next();
		
		palabra = palabra.toLowerCase(); //convertimos la palabra en minuscula
		
		if (palabra.equals(claveCorrecta)) {
			System.out.println("Acceso permitido");
		} else {
			System.out.println("Acceso denegado");
		}

	}

}
