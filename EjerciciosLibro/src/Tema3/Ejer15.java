package Tema3;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		int num = sc.nextInt();
		
		mostrarPiramide(num);
		
	}
	
	private static void mostrarPiramide(int n) {
		/**
		 * indica en que fila se encuentra
		 */
		for(int fila = 1; fila <= n; fila++) {
			/*
			 * Empezará por el numero 1, y en la primera fila escribira "n" * 4
			 * en la siguiente, como la fila será el 2, escribirá "n" * 3
			 * y asi sucesivamente
			 */
			for(int columna = fila; columna <= n; columna++ ) {
				System.out.print("*");
			}
			//acaba la fila, y salta a la siguiente
			System.out.println("");
		}
	}

}
