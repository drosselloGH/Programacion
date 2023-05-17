//Desarrolla modularmente (usando tres métodos, además de main( )) un programa que solicite
//por consola una lista de números enteros, los ordene y los muestre en pantalla.

package hoja1;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		pedir(numeros);

		ordenar(numeros);

		mostrar(numeros);

	}

	// pedir numeros y rellenar array
	static void pedir(int[] numeros) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i + 1));
			numeros[i] = sc.nextInt();
		}
	}

	// ordenar array
	static void ordenar(int[] numeros) {
		int aux;
		int posMin = 0;

		for (int i = 0; i < numeros.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}

			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;

		}
	}

	// mostrar array
	static void mostrar(int[] numeros) {
		System.out.println("Array ordenado: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+"\t");
		}
	}

}
