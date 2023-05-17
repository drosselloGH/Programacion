//Escribe un programa que almacene estos datos en un array bidimensional y los muestre por pantalla
//en forma de tabla. Después, mostrará una lista simplificada con modelos de portátiles y sus precios

package pract1;

public class Ejer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String portatiles[][] = { { "Asus", "Portátil ASUS Vibobook 15", "i5", "12", "15.6", "649" },
				{ "HP", "Portátil HP 15s-fq5046ns", "i7", "16", "15.6", "759" },
				{ "Acer", "Portátil Acer Aspire 3 A315", "i7", "16", "15.6", "679" },
				{ "Medion", "Portátil Medion Akoya E15301", "Ryzen 7", "16", "15.6", "559" },
				{ "MSI", "Portátil Gaming MSI Katana", "i7", "16", "15.6", "1199" },
				{ "Apple", "Apple MacBook Air 13 (2022)", "M2", "8", "13.6", "1399" },
				{ "Asus", "Portátil ASUS ViboBook 15X", "Ryzen 7", "16", "15.6", "799" } };
		
		System.out.println("Catálogo general de portátiles");
		System.out.println("=======================================================================");
		
		//mediante este bulce, mostraremos el contenido del array bidimensional
		//primero una fila entera, y luego la siguiente
		for (int fila = 0; fila < portatiles.length; fila++) {
			for (int columna = 0; columna < portatiles[fila].length; columna++) {
				System.out.print(portatiles[fila][columna]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\nPortátiles y precio");
		System.out.println("=======================================================================");
		
		//con este bucle, mostramos las columnas(íncices) especificadas de cada fila
		for (int fila = 0; fila < portatiles.length; fila++) {
			System.out.println(portatiles[fila][1]+"\t"+portatiles[fila][portatiles[fila].length-1]+" €");
		}
		
	}

}
