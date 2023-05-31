package ejerRandom;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArchivosEjer4 {

	private static final String NOMBRE_ARCHIVO = System.getProperty("user.home")+"pagina.html";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Título de la página: ");
		String titulo = sc.nextLine();
		System.out.print("Encabezado de la página: ");
		String encabezado = sc.nextLine();
		System.out.print("Contenido de la página: ");
		String contenido = sc.nextLine();

	}

	public static void pagina(String titulo, String encabezado, String contenido) {
		try {
			FileWriter archivo = new FileWriter(NOMBRE_ARCHIVO);
			BufferedWriter buffer = new BufferedWriter(archivo);

			buffer.write("<!DOCTYPE html> <head> <title>"+titulo+"</title> </head> <body> <h1>"+encabezado+"</h1><p>"+contenido+"</p> </body> </html>");
			
			buffer.close();

		} catch (IOException e) {
			System.out.println("No se pudo crear el archivo");
		}
	}

}
