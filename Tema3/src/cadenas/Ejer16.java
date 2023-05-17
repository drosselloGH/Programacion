//Leer una frase y generar su acrónimo (primera letra, en mayúsculas, de cada frase).

package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una frase");
		String frase = sc.nextLine();
		
		String palabras[] = frase.split(" ");
		System.out.println(Arrays.toString(palabras));
		
		for (int i = 0; i < palabras.length; i++) {
			//convertimos el caracter, porque un "char" no se le puede
			//hacer un ".toUpperCase()"
			String letra = "" + (palabras[i].charAt(0));
			System.out.print(letra.toUpperCase());
			System.out.print(".");
		}

	}

}
