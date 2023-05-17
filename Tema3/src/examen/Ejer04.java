package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase y te la reescribiré con las palabras en orden alfabético: ");
		String frase = sc.nextLine();

		// dividimos la frase en palabras
		String palabras[] = frase.split(" ");

		// comparamos las palabras
		String aux;
		int posMin;
		for (int i = 0; i < palabras.length; i++) {
			posMin = i;
			for (int j = i + 1; j < palabras.length; j++) {
				if (palabras[j].compareTo(palabras[posMin]) < 0) {
					posMin = j;
				}
			}

			aux = palabras[i];
			palabras[i] = palabras[posMin];
			palabras[posMin] = aux;
		}

		System.out.println("Tu frase, ordenada: ");
		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i]+" ");
		};

		// buscamos cuantas veces aparece una palabra
		System.out.println("\nEscribe una palabra, y te diré cuántas veces aparece en la frase anterior: ");
		String palabra = sc.nextLine();

		int vecesPalabra = 0;

		for (int i = 0; i < palabras.length; i++) {
			if (palabra.equals(palabras[i])) {
				vecesPalabra++;
			}
		}

		System.out.println("La palabra que has escrito aparece " + vecesPalabra + " veces en la frase anterior.");

	}

}