package ejerRandom;

import java.io.File;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		File ruta = new File("direccion/superior/inferior");
		boolean creada = ruta.mkdirs();
		
		if(creada) {
			System.out.println("Se ha creado la ruta");
		}
		
		boolean borrada = ruta.delete();
		if(borrada) {
			System.out.println("SE ha borrado la ruta");
		}
		
	}
	
}
