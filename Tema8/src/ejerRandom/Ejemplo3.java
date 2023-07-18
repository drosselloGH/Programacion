package ejerRandom;

import java.io.File;

public class Ejemplo3 {
	public static void main(String[] args) {

		File archivo1 = new File("ficheros/miarchivo.txt");
		File archivoDestino = new File("fichero/nuevoArchivo.txt");
		
		boolean cambiado = archivo1.renameTo(archivoDestino);
		
		
	}
}
