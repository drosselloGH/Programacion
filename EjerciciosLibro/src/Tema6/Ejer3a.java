package Tema6;

import java.util.Scanner;

public class Ejer3a {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Jugador 1 escribe una frase:");
		String frase = sc.nextLine();

		comparar(frase);

	}

	private static void comparar(String contraseña) {
		
		int comparacion = 1;
		
		while(comparacion != 0) {
			
			System.out.println("Jugador 2 escribe la contraseña escrita por el Jugador 1");
			String respuesta = sc.nextLine();
			
			comparacion = contraseña.compareTo(respuesta);
			
			if (comparacion > 0) {
				System.out.println("La contraseña es menor alfabeticamente");
			} else if (comparacion < 0) {
				System.out.println("La contraseña es mayor alfabéticamente");
			} else if (comparacion == 0) {
				System.out.println("Correcto");
			}
		}
		
	}

}
