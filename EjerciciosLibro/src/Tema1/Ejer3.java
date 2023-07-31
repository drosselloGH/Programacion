package Tema1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe tu edad: ");
		int edad = sc.nextInt();
		
		System.out.println("Tu edad el año que viene será: "+(edad + 1));
	}
	
}
