package Tema3;

import java.util.Scanner;

public class Ejer5b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, resultado, operacionesCorrectas = 0;

		do {
			num1 = (int) (Math.random() * 100 + 1);
			num2 = (int) (Math.random() * 100 + 1);

			System.out.println("Suma estos numeros: " + num1 + " + " + num2);
			
			resultado = sc.nextInt();
			
			if(resultado == num1 + num2) {
				operacionesCorrectas++;
			}

		} while (resultado == num1 + num2);
		
		System.out.println("Has realizado correctamente "+operacionesCorrectas+" operaciones");

	}

}
