package ejemplos;

import java.io.File;

public class Ejemplo06File {

	public static void main(String[] args) {
		
		File documentos = new File("/etc/miprograma");
		
		boolean carpetaCreada = documentos.mkdir();
		
		if(carpetaCreada) {
			System.out.println("Se ha creado la carpeta");
		} else {
			System.out.println("No se ha podido crear la carpeta");
		}
		
		File xml = new File("documentos/imagenes/xml");
		carpetaCreada = xml.mkdirs();		
		
		if(carpetaCreada) {
			System.out.println("Se han creado las carpetas");
		} else {
			System.out.println("No se han podido crear las carpetas");
		}
		
	}
	
}
