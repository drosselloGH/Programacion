package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//programa que abre un archivo de texto plano y muestra sus dos primerar lineas en la terminal

public class Ejemplo01FileReader {

	public static void main(String[] args) {

		try {
			// abrir el archivo para lectura
			FileReader archivo = new FileReader("ficheros/ejemplo.txt");
			
			//creamos una variable que apunta a un buffer de entrada asociado a nuestro archivo
			BufferedReader buffer = new BufferedReader(archivo);
			
			//llemos la primera linea del archivo
			String linea = buffer.readLine();
			
			//mostramos la primera linea del archivo
			System.out.println(linea);
			
			//leemos la segunda linea del archivo
			linea = buffer.readLine();
			
			//la mostramos
			System.out.println(linea);
			
			//al final cerramos el archivo
			buffer.close();
			
			
			//este catch indica que no se encuentra el archivo
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
			
			//cualquier tipo de excepcion de entrada/salida
		} catch (IOException e) {
			System.out.println("Se ha producido un error leyendo el archivo");
		}

	}

}
