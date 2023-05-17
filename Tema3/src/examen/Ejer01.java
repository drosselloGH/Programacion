package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int asistentes[] = new int[6];

		// leemos los asistentes
		for (int i = 0; i < asistentes.length; i++) {
			System.out.println("Película nº" + (i + 1));
			asistentes[i] = sc.nextInt();
		}

		System.out.println("Escribe un número y te diré si está contenido en el array: ");
		int num = sc.nextInt();

		boolean encontradoNumero = false;

		// comprobamos si esta el numero entre los asistentes
		for (int i = 0; i < asistentes.length; i++) {
			if (num == asistentes[i]) {
				encontradoNumero = true;
				break;
			}
		}
		if (encontradoNumero = true) {
			System.out.println("Número encontrado");

		} else {
			System.out.println("No hay ninguna película con el número de asistentes que tú has indicado.");
		}

		
		// ordenamos el array de mayor a menor
		int posMax = 0;
		int aux;

		for (int i = 0; i < asistentes.length - 1; i++) {
			posMax = i;
			for (int j = i + 1; j < asistentes.length; j++) {
				if (asistentes[j] > asistentes[posMax]) {
					posMax = j;
				}
			}

			aux = asistentes[i];
			asistentes[i] = asistentes[posMax];
			asistentes[posMax] = aux;

		}

		System.out.println("Asistentes a cada proyección, ordenados de mayor a menor");
		for (int i = 0; i < asistentes.length; i++) {
			System.out.print(asistentes[i] + "\t");
		}

	}

}
