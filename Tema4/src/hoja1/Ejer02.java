package hoja1;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Como te llamas?");
		String nombre = sc.nextLine();
		
		System.out.println("Cuantos años tienes?");
		int edad = sc.nextInt();

		System.out.println(saludar(nombre, edad));
		
	}
	
	static String saludar (String nombre, int edad) {
		String saludo = "Hola, "+nombre+", no parece que tengas "+edad+" años";
		return saludo;
	}

}
