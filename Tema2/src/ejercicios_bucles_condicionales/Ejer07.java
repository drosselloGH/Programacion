//7.- Escribe un programa que vaya escribiendo los números pares del 2 al 200. Cada vez que uno de
//esos números sea divisible por 20 aparecerá además la frase "Divisible por 20". Utiliza un bucle
//while.

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// empezamos por el numero 2
		int num = 2;

		while (num <= 200) {
			// asi sabemos si el numero es par o no
			if (num % 2 == 0) {
				System.out.print(num + " es divisible por 2");

				// si el numero es divisible entre 20
				if (num % 20 == 0) {
					System.out.println(" (también es divisible por 20)");
				} else {
					System.out.println("");
				}

			}
			num++;
		}

	}

}
