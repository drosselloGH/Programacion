package pract1;

import java.util.Scanner;

public class Act01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuál es tu nombre?");
		String nombre = sc.nextLine();

		System.out.println("¿Cuántos años tienes?");
		int edad = sc.nextInt();

		int precioEntrada = 0;
		
		if (edad < 12) {
			precioEntrada = 0;
		} else if (edad >= 12 && edad < 18) {
			precioEntrada = 10;
		} else if (edad >= 18 && edad < 65) {
			precioEntrada = 20;
		} else {
			precioEntrada = 5;
		}
		
		System.out.println("\nBienvenido al zoo, " + nombre + "! Tu entrada cuesta " + precioEntrada + " euros.");
		
		sc.close();

	}

}