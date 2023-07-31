package Tema3;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int NUM_SECRETO = (int) (Math.random() * 100 + 1);

		System.out.println(NUM_SECRETO);

		System.out.println("Escribir -1 detiene el programa");

		System.out.println("Adivina el numero secreto: ");
		int num = sc.nextInt();

		while (num != NUM_SECRETO && num != -1) {
			if (num < NUM_SECRETO) {
				System.out.println("Mayor");
				num = sc.nextInt();
			} else if (num > NUM_SECRETO) {
				System.out.println("Menor");
				num = sc.nextInt();
			}
		}

		if (num == NUM_SECRETO) {
			System.out.println("Has acertado");
		} else if (num == -1) {
			System.out.println("Ya te rindes?");
		}

	}

}
