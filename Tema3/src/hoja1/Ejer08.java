//8.- Modifica el programa anterior para que el programa pare de pedir notas si se le pasa un valor
//negativo

package hoja1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float[] notas = new float[10];
		int i = 0;
		float nota = 0;

		while (i < notas.length) {
			System.out.println("Escribe una nota");
			notas[i] = sc.nextFloat();
			
			
			if(notas[i] < 0) {
				System.out.println("Nota negativa");
				break;
			}
			i++;

		}
		
		for (int j = 0; j <= notas.length; j++) {
			if (notas[j] < 0) {
				break;
			}
			System.out.println("Nota " + (j + 1) + " = " + notas[j]);
			
			
		}

	}

}
