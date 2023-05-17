//Escribe un programa que lea el número de páginas de cinco libros y las almacene en un array. A
//continuación, mostrará el total de páginas que contienen los libros y el array ordenado.

package pract1;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int paginas[] = new int[5];

		int sumaPag = 0;

		System.out.println("Introduce el número de páginas de cinco libros.");

		// en este bucle, recogeremos todas las páginas de nuestros 5 libros,
		// y luego sumaremos estas páginas a la variable que almacenará la cantidad
		// total de páginas
		for (int i = 0; i < paginas.length; i++) {
			System.out.println("Libro " + (i + 1) + ": ");
			paginas[i] = sc.nextInt();

			sumaPag += paginas[i];
		}

		System.out.println("\nLos libros tienen un total de " + sumaPag + " páginas.\n");

		// mediante este bucle, mostraremos el contenido de todos y cada uno de los
		// índices del array, ordenado
		
		int posMin, aux;
		
		//mediante este bucle, ordenaremos el array de menor a mayor
		System.out.println("El array de páginas, ordenado, queda así:");
		//primero seleccionaremos el primer índice del array
		for (int i = 0; i < paginas.length -1; i++) {
			posMin = i;
			//y seleccionamos el siguiente (i +1)
			for (int j = i +1; j < paginas.length; j++) {
				//si el numero siguiente a "i", la posición mínima será "j"
				if(paginas[j] < paginas[posMin]) {
					posMin = j;
				}
			}
			
			//realizamos el intercambio de índices
			aux = paginas[i];
			paginas[i] = paginas[posMin];
			paginas[posMin] = aux;
			
		}
		
		//ahora, recorremos todo el array, una vez ya ordenado
		for (int i = 0; i < paginas.length; i++) {
			System.out.print(paginas[i]+"\t");
		}

	}

}
