//5.- Haz un programa que te pida un número y te devuelva su tabla de multiplicar. Esto se repetirá
//indefinidamente hasta que el usuario escriba 0. En ese caso se escribirá la tabla del cero y el
//programa terminará. Usa los bucles do-while y for

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla;

		do {
			System.out.println("\nQué tabla de multiplicar quieres saber?");
			tabla = sc.nextInt();

			System.out.println("***TABLA DEL " + tabla + "***");
			for (int i = 0; i <= 10; i++) {
				System.out.println(tabla + " x " + i + " = " + (tabla * i));
			}

		} while (tabla != 0);

	}

}
