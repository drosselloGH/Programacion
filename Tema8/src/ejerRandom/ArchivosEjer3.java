package ejerRandom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ArchivosEjer3 {

	private static final String NOMBRE_ARCHIVO = "ficheros/contactos2.txt";
	
	public static void main(String[] args) {
		
		try {
			FileReader archivo = new FileReader(NOMBRE_ARCHIVO);
			BufferedReader buffer = new BufferedReader(archivo);
			
			String linea = buffer.readLine();
			
			System.out.println("=== CONTACTOS ===");
			
			while(linea != null) {
				String datos[] = linea.split(",");
				System.out.println("Apellidos: "+datos[0]);
				System.out.println("Nombre: "+datos[1]);
				System.out.println("Teléfono: "+datos[2]);
				System.out.println("------");
				linea = buffer.readLine();
			}
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo encontrar el archivo");
		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo");
		}
		
	}
	
}
