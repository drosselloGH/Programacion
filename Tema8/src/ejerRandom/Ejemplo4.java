package ejerRandom;

import java.io.File;

public class Ejemplo4 {

	public static void main(String[] args) {
		
		File archivo = new File("ficheros/hola.txt");
		boolean archivoCreado = archivo.mkdir();
		
		File carpeta = new File("ficheros/carpetaBorrar");
		boolean carpetaCreada = carpeta.mkdirs();
		
		if(archivo.delete()) {
			System.out.println("Archivo borrado");
		} else {
			System.out.println("No se pudo borrr el archivo");
		}

		if(carpeta.delete()) {
			System.out.println("Carpeta borrada");
		} else {
			System.out.println("No se pudo borrar la carpeta");
		}
		
	}
	
}
