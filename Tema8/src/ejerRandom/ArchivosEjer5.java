package ejerRandom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArchivosEjer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nombre archivo. ");
		String archivo = sc.nextLine();
		
		System.out.println("Palabra a buscar");
		String palabra = sc.nextLine();
		
	}
	
	private static int buscarPalabra(String file, String palabra) {
		
		try {
			FileReader archivo = new FileReader("ficheros/"+file+".txt");
			BufferedReader buffer = new BufferedReader(archivo);
			
			String linea = buffer.readLine();
			
			int vecesPalabra = 0;
			
			while(linea != null) {
				if(linea.indexOf(palabra) != -1){
					vecesPalabra++;
				}
				linea = buffer.readLine();
			}
			
			buffer.close();
			
			
			return vecesPalabra;
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo acceder al archivo");
		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo");
		}
		
		return 0;
	}
	
}
