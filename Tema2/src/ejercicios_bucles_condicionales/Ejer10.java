//10.- Escribe un programa que vaya escribiendo los números impares del 3 al 299. Cada vez que uno
//de esos números sea divisible por 5 aparecerá además la frase "Divisible por 5". Utiliza un bucle
//while.

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 3;
		while (num <= 299) {
				System.out.println(num);
				if (num % 5 == 0) {
					System.out.println(num + " Divisible por 5");
				}

			num += 2;
		}

	}

}
