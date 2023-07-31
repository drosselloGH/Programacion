package Tema1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota 1");
		float nota1 = sc.nextFloat();
		
		System.out.println("Nota 2");
		float nota2 = sc.nextFloat();
		
		System.out.println("La media es de " + ((nota1 + nota2) / 2));

	}

}
