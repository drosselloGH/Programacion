//Leer una frase y mostrarla al revés (por palabras)

package cadenas;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una frase:");
		String frase = sc.nextLine();
		String[] palabras = frase.split(" ");
		for (int i = palabras.length-1; i >= 0; i--) {
			System.out.println(palabras[i]);
		}

	}

}
