//8.- Escribe un programa que pida un número entero al usuario. A continuación escribirá en pantalla
//todos los números entre el 1 y ése. Utiliza un bucle for.

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número entero");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}

	}

}
