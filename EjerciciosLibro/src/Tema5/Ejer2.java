package Tema5;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double numeros[] = new double[5];
		
		System.out.println("** Escribe 5 numeros **");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero "+(i +1));
			numeros[i] = sc.nextDouble();
		}
		
		for(double numero : numeros) {
			System.out.println(numero);
		}

	}

}
