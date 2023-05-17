import java.util.Arrays;

//metodo seleccion para ordenar un array

public class Ejemplo09 {

	public static void main(String[] args) {

		int edades[] = { 35, 15, 12, 10, 7 };

		// variable que nos servirá para intercambiar dos valores en un array

		int aux;

		// variable que indicara la posicion del array donde esta el valor mas pequeño
		int posMin;

		// mostramos el array sin ordenar
		for (int j = 0; j < edades.length; j++) {
			System.out.println(edades[j]);

		}
		
		System.out.println(Arrays.toString(edades));

		// recorremos el array hasta la penultima posicion
		for (int i = 0; i < edades.length - 1; i++) {

			// la posicion minima sera la primera posicion (i)
			posMin = i;

			for (int j = i + 1; j < edades.length; j++) {
				if (edades[j] < edades[posMin]) {
					posMin = j;
				}
			}
			// ahora, posMin apunta a la posicion del elemento mas pequeño del array
			// System.out.println(posMin + " = posMin");

			// intercambiamos los valores de i (primera posicion sin ordenar en el array) y
			// de posMin
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;

			System.out.println("\n" + Arrays.toString(edades));

		}

	}

}
