//Programa que lee una frase desde el teclado y la muestra quitando la primera palabra

package cadenas;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una frase");
		String frase = sc.nextLine();
		
		int posicion = frase.indexOf(" ");
		
		//empezamos por "+1", puesto que de no hacerlo asi, nos mostraria el espacio
		for (int i = posicion +1 ; i < frase.length(); i++) {
			System.out.print(frase.charAt(i));
		}

	}

}
