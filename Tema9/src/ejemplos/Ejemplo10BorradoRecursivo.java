package ejemplos;

import java.io.File;

public class Ejemplo10BorradoRecursivo {

	public static void main(String[] args) {
		
		String ruta = "ficheros/pruebaBorradoRecursivo";
		
		File carpeta = new File(ruta);
		
		
		borrar(carpeta);
		
	}
	
	private static void borrar(File archivo) {
		//comprobamos si el archivo es una carpeta
		if(archivo.isDirectory()) {
			//borramos el contenido de la carpeta
			//.listFiles() devuelve un array con los archivos del directorio
			for (File file : archivo.listFiles()) {
				//borramos cada archivo
				borrar(file);
			}
		}
		
		//el metodo delete permite borrar una carpeta vacía o un archivo
		//aunque sea una carpeta vacía, no se tiene en cuenta como directorio
		System.out.println("Borrando "+archivo.toString());
		archivo.delete();
		
	}
	
}
