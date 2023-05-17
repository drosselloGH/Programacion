package hoja1;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		System.out.println("Te llamas " + leerNombre());

	}

	static String leerNombre() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Como te llamas");
		String nombre = sc.nextLine();
		return nombre;

	}

}
