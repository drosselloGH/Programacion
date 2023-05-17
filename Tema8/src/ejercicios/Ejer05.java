package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Escribe el nombre de un archivo");
		String nombreArchivo = sc.nextLine();

		System.out.println("Escribe el nombre de una palabra del archivo");
		String palabra = sc.nextLine();

		leerArchivo(nombreArchivo, palabra);
	}

	public static void leerArchivo(String nombreArchivo, String palabra) {
		try {
			FileReader archivo = new FileReader("ficheros/" + nombreArchivo + ".txt");

			BufferedReader buffer = new BufferedReader(archivo);

			int cantPalabras = 0;
			
			String linea = buffer.readLine();

			while (linea != null) {
				//es una expresion regular: separa la cadena por todo lo que no sean letras ni numeros
				String palabras[] = linea.split("\\W+");
				
				//recorremos todo el array, y si el contenido es igual a la palabra introducida
				//el contador de palabras +1
				for(String contenido: palabras) {
					if(contenido.equals(palabra)) {
						cantPalabras++;
					}
				}
						
				//leemos la siguiente linea
				linea = buffer.readLine();
			}

			buffer.close();
			
			System.out.println("En el archivo "+nombreArchivo+".txt la palabra "+palabra+" se repite "+cantPalabras+" veces");

		} catch (FileNotFoundException e) {
			System.out.println("No se pudo encontrar el archivo");
		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo");
		}
	}

}
