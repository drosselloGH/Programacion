//Escribe un programa que contenga el array del ejercicio anterior. Sobre estos datos, mostrará la
//siguiente información:
//• Lista con los modelos y precios de los portátiles que cuestan más de 700 euros.
//• Modelo y precio del ordenador más barato.
//• Modelo y precio del ordenador más caro

package pract1;

public class Ejer03 {

	public static void main(String[] args) {
		
		String portatiles[][] = { { "Asus", "Portátil ASUS Vibobook 15", "i5", "12", "15.6", "649" },
				{ "HP", "Portátil HP 15s-fq5046ns", "i7", "16", "15.6", "759" },
				{ "Acer", "Portátil Acer Aspire 3 A315", "i7", "16", "15.6", "679" },
				{ "Medion", "Portátil Medion Akoya E15301", "Ryzen 7", "16", "15.6", "559" },
				{ "MSI", "Portátil Gaming MSI Katana", "i7", "16", "15.6", "1199" },
				{ "Apple", "Apple MacBook Air 13 (2022)", "M2", "8", "13.6", "1399" },
				{ "Asus", "Portátil ASUS ViboBook 15X", "Ryzen 7", "16", "15.6", "799" } };

		System.out.println("Portátiles con precio mayor de 700 €");
		System.out.println("==============================================================");

		int precio;

		// con este bucle recorremos cada fila del array
		for (int fila = 0; fila < portatiles.length; fila++) {
			// convertimos el precio, de tipo String, a tipo Integer
			precio = Integer.parseInt(portatiles[fila][portatiles[fila].length - 1]);
			// si se da el caso de que el precio es mayor que 700,
			// mostraremos esas filas y columnas
			if (precio > 700) {
				System.out.println(portatiles[fila][1] + "\t" + portatiles[fila][portatiles[fila].length - 1]);
			}
		}

		// estas serán la fila con el valor mínimo y máximo
		int filaMin = 0, filaMax = 0;

		// volvemos a recorrer las filas del array
		for (int fila = 1; fila < portatiles.length; fila++) {
			// si el valor Integer del array es menor que el valor del array de la fila con
			// el valor mínimo
			if (Integer.parseInt(portatiles[fila][portatiles[fila].length - 1]) < Integer
					.parseInt(portatiles[filaMin][portatiles[filaMin].length - 1])) {
				filaMin = fila;
				// si el valor Integer del array es mayor que el valor del array de la fila con
				// el valor máximo
			} else if (Integer.parseInt(portatiles[fila][portatiles[fila].length - 1]) > Integer
					.parseInt(portatiles[filaMax][portatiles[fila].length - 1])) {
				filaMax = fila;
			}
		}

		System.out.println();

		System.out.println("Ordenador más barato: " + portatiles[filaMin][1] + " ("
				+ portatiles[filaMin][portatiles[filaMin].length - 1] + " €)");
		System.out.println("Ordenador más caro: " + portatiles[filaMax][1] + " ("
				+ portatiles[filaMax][portatiles[filaMax].length - 1] + " €)");

	}

}
