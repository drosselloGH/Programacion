//Programa que te pide cinco palabras y te dice cuál es la que va primero,
//alfabéticamente.

package cadenas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejer13_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palabras[] = new String[5];
		String ordenABC[] = new String[5];

		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Escriba una palabra");
			palabras[i] = sc.nextLine();
		}

		int posMin1 = 0;
		String aux;

		for (int i = 0; i < palabras.length; i++) {
			posMin1 = i;
			for (int j = i + 1; j < ordenABC.length; j++) {
				int posicion = palabras[posMin1].toLowerCase().compareTo(palabras[j].toLowerCase());
				if (posicion > 0) {
					posMin1 = j;
				}
			}

			aux = palabras[i];
			palabras[i] = palabras[posMin1];
			palabras[posMin1] = aux;

		}

		System.out.println("Primera palabra ordenada: " + palabras[0]);
		
		System.out.println(Arrays.toString(palabras));

	}

}
