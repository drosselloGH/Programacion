//22.- Escribe una aplicación que muestre las tablas de multiplicar del 1 al 10.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("****TABLAS DE MULTIPLICAR****");

		for (int i = 1; i <= 10; i++) {
			System.out.println("\nTABLA DEL " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}

	}

}