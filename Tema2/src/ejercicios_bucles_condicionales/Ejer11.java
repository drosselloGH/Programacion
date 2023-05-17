//11.- Escribe un programa que pida un número entero al usuario. A continuación escribirá en pantalla
//todos los números entre ése y 500. Utiliza un bucle do-while.

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número");
		int num = sc.nextInt();

		do {
			num++;
			System.out.println(num);
		} while (num < 500);

	}

}
