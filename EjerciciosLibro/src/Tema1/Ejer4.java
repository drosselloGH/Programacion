package Tema1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el año actual: ");
		int anyo = sc.nextInt();
		
		System.out.print("Escribe tu año de nacimiento: ");
		int nacimiento = sc.nextInt();
		
		System.out.println("Tienes " + (anyo - nacimiento)+" años");

	}

}
