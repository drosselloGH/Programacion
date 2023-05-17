package hoja1;

import java.util.Scanner;

public class Ejer15b {

	public static void main(String[] args) {

		int edades[] = new int[5];
		
		rellenar(edades);

		ordenar(edades);

		mostrar(edades);

	}

	public static void mostrar(int[] edades) {
		System.out.println("Edades ordenadas: ");
		for (int i = 0; i < edades.length; i++) {
			System.out.print(edades[i] + " ");
		}
	}

	public static void ordenar(int[] edades) {
		int aux;

		// cuál va a ser el indice con el valor mas bajo
		int posMin;

		for (int i = 0; i < edades.length - 1; i++) {
			// asumimos que el índice con el valor más bajo
			// será "i"
			posMin = i;

			for (int j = i + 1; j < edades.length; j++) {
				if (edades[j] < edades[posMin]) {
					// "posMin" tendrá el índice "j", porque
					// es más bajo
					posMin = j;
				}
			}

			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;

		}
	}

	public static void rellenar(int[] edades) {
		Scanner sc = new Scanner(System.in);		

		// guardamos todas las edades en un array
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Escribe una edad");
			edades[i] = sc.nextInt();

		}
	}

}
