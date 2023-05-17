//Programa que lee una frase desde el teclado y nos muestra la primera palabra

package cadenas;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una frase");
		String frase = sc.nextLine();

		//primero buscamos la ubicación del primer espacio
		System.out.println(frase.indexOf(" "));
		int posicion = frase.indexOf(" ");
		
		//recorremos los caracteres de la frase hasta llegar al espacio
		for (int i = 0; i <= posicion; i++) {
			System.out.print(frase.charAt(i));
		}

	}

}
