package ejerRandom;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArchivosEjer2 {

	private static final String NOMBRE_FICHERO = "ficheros/contactos2.txt";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int veces = 0;
		while (veces < 3) {
			System.out.println("Nombre: ");
			String nombre = sc.nextLine();

			System.out.println("Apellido: ");
			String apellido = sc.nextLine();

			System.out.println("Teléfono: ");
			String telefono = sc.nextLine();

			leerDatos(nombre, apellido, telefono);
			
			veces++;
		}
	}
	
	private static void leerDatos(String nombre, String apellido, String telefono) {
		try {
			FileWriter archivo = new FileWriter(NOMBRE_FICHERO, true);
			BufferedWriter buffer = new BufferedWriter(archivo);
			
			buffer.write(nombre+","+apellido+","+telefono+"\n");
			
			System.out.println("Contacto guardado\n");
			
			buffer.close();
			
		} catch (IOException e) {
			System.out.println("No se pudo guardar los datos");
		}
	}

}
