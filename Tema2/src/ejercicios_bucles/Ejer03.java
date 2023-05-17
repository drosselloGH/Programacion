//3.- Escribe una aplicación que pregunte repetidamente un número entero hasta que el usuario
//escriba un valor entre 1 y 10. A continuación el programa escribirá un mensaje informando del
//número introducido.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número");

		int num = sc.nextInt();

		while (num < 1 || num > 10) {
			System.out.println("escribe un número");
			num = sc.nextInt();

		}

		System.out.println("Has escrito el numero " + num);
	}

}
