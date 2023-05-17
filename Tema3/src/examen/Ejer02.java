package examen;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double horas[] = { 1, 2.5, 2.1, 1.5, 1.3, 1.7, 1.5, 1.3, 1.7, 2.4 };

		System.out.println("Dime una cantidad de tiempo y te diré cuántas veces aparece en el array: ");
		double num = sc.nextDouble();

		int vecesAparecido = 0;

		// contamos cuantas veces aparece en el array
		for (int i = 0; i < horas.length; i++) {
			if (num == horas[i]) {
				vecesAparecido++;
			}
		}
		System.out.println("La cantidad " + num + " aparece " + vecesAparecido + " veces");
		System.out.println("Indica cuál es el tiempo máximo permitido para la práctica");
		double tMax = sc.nextDouble();
		
		// mostramos el array, con el maximo indicado por el usuario
		for (int i = 0; i < horas.length; i++) {
			if (horas[i] > tMax) {
				horas[i] = 0;

			}
			System.out.println(horas[i]);
		}

//		System.out.println("El array ha quedado así: ");
//		for (int i = 0; i < horas.length; i++) {
//			System.out.print(horas[i] + "\t");
//		}

	}

}