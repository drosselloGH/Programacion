//20.- Crea un programa que muestre las diez primeras potencias del número 2 (o sea, 2, 4, 8, 16,
//etc.).

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ") " + (int) Math.pow(2, i));
		}

	}

}
