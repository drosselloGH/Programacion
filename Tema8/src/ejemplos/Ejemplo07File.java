package ejemplos;

import java.io.File;

public class Ejemplo07File {

	public static void main(String[] args) {
		
		//borrar una carpeta o archivo
		File xml = new File("documentos/imagenes/xml");
		
		//eliminamos la carpeta
		boolean borrado = xml.delete();
		
		if(borrado) {
			System.out.println("Se ha borrado la carpeta");
		} else {
			System.out.println("No se ha podido borrar la carpeta");
		}
		
		//renombrar una carpeta o archivo
		File imagenes = new File("documentos/imagenes");
		File fotos = new File("documentos/fotos");
		
		boolean renombrado = imagenes.renameTo(fotos);
		
		if(renombrado) {
			System.out.println("Se ha renombrado la carpeta");
		} else {
			System.out.println("No se ha podido renombrar la carpeta"); 
		}
		
		imagenes.
		
		
	}
	
}
