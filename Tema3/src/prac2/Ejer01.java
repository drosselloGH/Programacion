//Escribe un programa que te pida diez números y luego te indique cuántos son múltiplos de 3 y
//cuántos son múltiplos de 7. Ten en cuenta que un número puede ser múltiplo de 3 y de 7 a la vez

package prac2;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		// cuantos numeros son multiplos de 3
		int multiplos3 = 0;

		// cuantos numeros son múltiplos de 7
		int multiplos7 = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Escribe un número");
			num = sc.nextInt();

			if (num % 3 == 0 && num % 7 == 0) {
				multiplos3++;
				multiplos7++;
			} else if (num % 3 == 0) {
				multiplos3++;
			} else if (num % 7 == 0) {
				multiplos7++;
			}

		}
		System.out.println("Has escrito " + multiplos3 + " múltiplos de 3 y " + multiplos7 + " de 7");
	}

}
