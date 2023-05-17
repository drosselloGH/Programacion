//Coger una cadena y poner la primera letra de cada palabra en mayúsculas

package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una frase");
		String frase = sc.nextLine();
		
		String palabras[] = frase.split(" ");
		
		//recorremos cada palabra del array
		for (int i = 0; i < palabras.length; i++) {
			//recorremos cada letra de la palabra
			for (int j = 0; j < palabras[i].length(); j++) {
				//con la primera letra
				if(j == 0) {
					String letra =""+ palabras[i].charAt(j);
					System.out.print(letra.toUpperCase());
				//con el resto de letras
				} else {
					System.out.print(palabras[i].charAt(j));
				}
				
			}
			System.out.print(" ");
		}

	}

}
