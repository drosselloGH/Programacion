package hoja1;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Como te llamas?");
		String nombre = sc.nextLine();
		System.out.println("Cuantos años tienes?");
		int edad = sc.nextInt();
		// pasamos la variable nombre a la llamada del metodo
		saludar(nombre, edad);
		System.out.println("Hasta otra");

	}

	// los parenetesis indican qué datos manejan
	static void saludar(String nombre, int edad) {
		System.out.println("Hola, " + nombre + ", no parece que tengas " + edad + " años");
	}

}
