//La siguiente tabla muestra los números atómicos de los elementos que forman una muestra de
//un material desconocido. Escribe un programa que los muestre ordenados de menor a mayor. Al
//final también indicará el número atómico menor y el mayor.

package hoja2;

import java.util.Arrays;

public class Ejer12 {

	public static void main(String[] args) {

		int numAtom[] = { 8, 2, 10, 20, 12, 71, 15, 23 };

		int posMin, aux;

		for (int i = 0; i < numAtom.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < numAtom.length; j++) {
				if (numAtom[j] < numAtom[posMin]) {
					posMin = j;
				}
			}

			aux = numAtom[i];
			numAtom[i] = numAtom[posMin];
			numAtom[posMin] = aux;

			System.out.println(Arrays.toString(numAtom));
		}

		System.out.println("\nArray ordenado: " + Arrays.toString(numAtom));
		System.out.println("Número atómico menor: " + numAtom[0]);
		System.out.println("Número atómico mayor: " + numAtom[numAtom.length - 1]);

	}

}
