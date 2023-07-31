package Tema2;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("** Resultados ecuacuion 2ndo grado **");

		System.out.print("a = ");
		int a = sc.nextInt();

		System.out.print("b = ");
		int b = sc.nextInt();

		System.out.print("c = ");
		int c = sc.nextInt();
		
		calculoEcuacion(a, b, c);

	}

	public static void calculoEcuacion(int a, int b, int c) {
		if (a != 0) {
			double contRaiz = (Math.pow(2, b) - (4 * a * c));
			if (contRaiz > 0) {
				double raiz = Math.sqrt(contRaiz);

				System.out.println("\n== RESULTADOS ==");
				
				double resultado1 = ((-b + raiz) / (2 * a));
				System.out.println("\tx1 = " + resultado1);
				double resultado2 = ((-b - raiz) / (2 * a));
				System.out.println("\txs = " + resultado2);
			} else if (contRaiz == 0) {
				int resultado = (-b / (2 * a));
				System.out.println(resultado);
			} else if (contRaiz < 0) {
				System.out.println("No existe raiz cuadrada de número negativo");
			}

		} else {
			System.out.println("No es una ecuación de segundo grado");
		}
	}

}
