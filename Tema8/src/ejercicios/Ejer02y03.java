package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer02y03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cantContactos = 0;

		while (cantContactos < 3) {
			System.out.println("Escribe el nombre de un conocido: ");
			String nombre = sc.nextLine();
			System.out.println("Escribe el apellido de un conocido: ");
			String apellidos = sc.nextLine();
			System.out.println("Escribe el telefono de un conocido (formato xxx-xxxxxx): ");
			String telefono = sc.nextLine();

			escribirDatos(nombre, apellidos, telefono);

			cantContactos++;
		}
		
		mostrarContactos();

	}

	private static void escribirDatos(String nombre, String apellidos, String telefono) {
		try {
			FileWriter archivo = new FileWriter("ficheros/contactos.txt", true);

			BufferedWriter buffer = new BufferedWriter(archivo);

			buffer.write(nombre + "," + apellidos + "," + telefono + "\n");
			
			System.out.println("CONTACTO GUARDADO");
			System.out.println();
			
			buffer.close();

		} catch (IOException e) {
			System.out.println("Se ha producido un error");
			e.printStackTrace();
		}

	}
	
	private static void mostrarContactos() {
		try {
			FileReader archivo = new FileReader("ficheros/contactos.txt");
			
			BufferedReader buffer = new BufferedReader(archivo);
			
			String linea = buffer.readLine();
	
			System.out.println("***CONTACTOS***");
			
			while(linea != null) {
				String datos[] = linea.split(",");
				
				System.out.println("Nombre: "+datos[0]);
				System.out.println("Apellidos: "+datos[1]);
				System.out.println("Teléfono: "+datos[2]);
				System.out.println();
				
				linea = buffer.readLine();
				
			}
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			System.out.println("Se ha producido un error en la lectura");
		}
	}

}
