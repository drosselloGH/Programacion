package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/*
 * mostrar informacion de ventas de vehiculos con el siguiente formato:
 * 
 * Matricula: 
 * Modelo:
 * Precio: 
 *(lína en blanco)
 * 
 * */
public class Ejemplo03FileReader {

	public static void main(String[] args) {
		
		try {
			FileReader archivo = new FileReader("ficheros/ventas.txt");
			
			BufferedReader buffer = new BufferedReader(archivo);
			
			//leemos la primera linea del archivo
			String linea = buffer.readLine();
			
			//mientras la linea no sea null
			while(linea != null) {
				mostrarCoches(linea);				
				//leemos la siguiente linea
				linea = buffer.readLine();
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("Se ha producido un error al leer el archivo");
		}
		
	}
	
	private static void mostrarCoches(String linea) {
		String info[] = linea.split(",");
		System.out.println("======================");
		System.out.println("Matrícula: "+info[0]);
		System.out.println("Modelo: "+info[1]);
		System.out.println("Precio: "+info[2]+"\n");
	}
	
}
