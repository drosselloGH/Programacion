//Escribe un programa que contenga el array del ejercicio anterior. Te preguntará el nombre de un tipo
//de procesador y te dirá si hay algún equipo que use ese procesador.
//A continuación te pedirá que escribas una marca de ordenador, y te mostrará un listado de todos los
//ordenadores de ese fabricante y el procesador de cada uno. Además te calculará el precio total de
//esos ordenadores y el precio medio.

package pract1;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String portatiles[][] = { { "Asus", "Portátil ASUS Vibobook 15", "i5", "12", "15.6", "649" },
				{ "HP", "Portátil HP 15s-fq5046ns", "i7", "16", "15.6", "759" },
				{ "Acer", "Portátil Acer Aspire 3 A315", "i7", "16", "15.6", "679" },
				{ "Medion", "Portátil Medion Akoya E15301", "Ryzen 7", "16", "15.6", "559" },
				{ "MSI", "Portátil Gaming MSI Katana", "i7", "16", "15.6", "1199" },
				{ "Apple", "Apple MacBook Air 13 (2022)", "M2", "8", "13.6", "1399" },
				{ "Asus", "Portátil ASUS ViboBook 15X", "Ryzen 7", "16", "15.6", "799" } };

		System.out.println("Escribe el nombre de un procesador: ");
		String procesador = sc.nextLine();

		int cantProcesadores = 0;

		// con este bucle veremos si el nombre del procesador existe en cada una de las
		// filas del array
		for (int fila = 0; fila < portatiles.length; fila++) {
			// si el nombre del procesador escrito coincide con un nombre de procesador
			// almacenado en el array
			if (procesador.equals(portatiles[fila][2])) {
				cantProcesadores++;
			}

		}

		// según la cantidad de procesadores que haya en el array, se mostrará un
		// mensaje u otro
		if (cantProcesadores == 0) {
			System.out.println("No hay ningún ordenador con procesador " + procesador);
		} else {
			System.out.println("Hay al menos un ordenador con procesador " + procesador);
		}

		System.out.println("\nEscribe una marca de ordenador: ");
		String marca = sc.nextLine();

		System.out.println("\nPortátiles de marca " + marca.toUpperCase() + " (con tipo de procesador)");

		System.out.println("===========================================");

		double precioMedio = 0;
		double precio;
		int cantOrdenadores = 0;

		// mediante este bucle veremos el nombre del portatil de la marca seleccionada y
		// el procesador que lleva
		for (int fila = 0; fila < portatiles.length; fila++) {
			// si el nombre (en mayuscula) de la marca en el array concuerda con el nombre
			// (en mayuscula) de la marca proporcionada
			if (portatiles[fila][0].toUpperCase().equals(marca.toUpperCase())) {
				System.out.println(portatiles[fila][1] + " (Procesador " + portatiles[fila][2] + ")");
				//convertimos el valor del precio (De un String a un double)
				precio = Double.parseDouble(portatiles[fila][portatiles[fila].length - 1]);
				//sumamos el precio (double) a la suma total de precios
				precioMedio += precio;
				//sumamos +1 a la cantidad de ordenadores de esa marca
				cantOrdenadores++;
			}
		}

		System.out.println("---------------");

		System.out.println("Precio total de los portátiles " + marca.toUpperCase() + ": " + precioMedio + " €");
		System.out.println("Precio medio de los portátiles " + marca.toUpperCase() + ": "
				+ (precioMedio / cantOrdenadores) + " €");
	}

}
