//13.- Escribe un programa que pregunte un número entre 1 y 20. Si el número introducido no cumple
//la condición, se le volverá a preguntar hasta que la cumpla. Al final simplemente se mostrará el
//número en pantalla.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		do {
			System.out.println("Escribe un número del 1 al 20");
			num = sc.nextInt();

		} while (num < 1 || num > 20);
		System.out.println(num);

	}

}
