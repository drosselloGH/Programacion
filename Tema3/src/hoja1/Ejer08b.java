//8.- Modifica el programa anterior para que el programa pare de pedir notas si se le pasa un valor
//negativo

package hoja1;

import java.util.Scanner;

public class Ejer08b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float[] notas = new float[10];
		int i = 0;
		float nota = 0;

		while (i < notas.length) {
			System.out.println("Escribe una nota");

			nota = sc.nextFloat();

			if (nota < 0) {
				System.out.println("Nota negativa");
				break;
			}

			notas[i] = nota;
			i++;

		}
		i = 0;

		while (i < notas.length) {
			System.out.println(notas[i]);
			i++;
		}

	}

}
