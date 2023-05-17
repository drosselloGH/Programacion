package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Título de la página: ");
		String titulo = sc.nextLine();
		System.out.print("Encabezado de la página: ");
		String encabezado = sc.nextLine();
		System.out.print("Contenido de la página: ");
		String contenido = sc.nextLine();

		crearWeb(titulo, encabezado, contenido);
		

	}

	private static void crearWeb(String titulo, String encabezado, String contenido) {

		String index = System.getProperty("user.home")+"/index.html";

		/* CODIGO HTML */
		String codigo = "<!DOCTYPE html>\n<head>\n<title>" + titulo + "</title>\n</head>\n<body><h1>" + encabezado + "  </h1>  <p>" + contenido + "</body>\n </html>";

		try {
			FileWriter archivo = new FileWriter(index, true);
			BufferedWriter buffer = new BufferedWriter(archivo);

			buffer.write(codigo+".html");
			System.out.print("Se ha creado la página en tu carpeta personal. De nada.");
			buffer.close();

		} catch (IOException e) {
			System.out.println("No se ha podido crear el archivo");
		}

	}

}
