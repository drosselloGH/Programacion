//Esta tabla muestra los nombres y precios de cuatro artículos de unos grandes almacenesGuarda la información en un array llamado precios. Después, muestra esta información en pantalla
//y calcula el precio total de los cuatro artículos.

package hoja2;

public class Ejer14 {

	public static void main(String[] args) {

		String precios[][] = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		System.out.println("Artículos");
		System.out.println("=====================");

		for (int fila = 0; fila < precios.length; fila++) {
			System.out.println();
			for (int columna = 0; columna < precios[fila].length; columna++) {
				System.out.print(precios[fila][columna] + "\t");
			}
		}

		// aqui es donde irá toda la suma de los precios
		float precioTotal = 0;

		// primero debemos mostrar todos los elementos de la columna 1 de cada una de
		// las filas
		for (int fila = 0; fila <= precios.length - 1; fila++) {

			// como convertir un String a float
			float precio = Float.parseFloat(precios[fila][1]);
			// sumamos al valor de "precioTotal" el valor de "precio"
			precioTotal += precio;
		}
		System.out.println();
		System.out.println("\nTotal: " + precioTotal + " €");

	}

}
