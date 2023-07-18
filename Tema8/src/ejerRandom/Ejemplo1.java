package ejerRandom;

import java.io.File;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		File carpeta = new File("Configuracion");
		boolean creada = carpeta.mkdir();
		if(creada) {
			System.out.println("Carpeta creada");
		}
		
	}
}
