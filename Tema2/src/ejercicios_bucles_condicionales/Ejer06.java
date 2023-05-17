//6.- Añade al programa anterior una comprobación del número introducido, de manera que si el
//usuario escribe "1", el programa le responda "No seas tonto" y vuelva a empezar el bucle, sin
//mostrar la tabla. Utiliza la palabra clave continue.

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla;

		do {
			System.out.println("\nQué tabla de multiplicar quieres saber?");
			tabla = sc.nextInt();
			
			if(tabla == 1) {
				System.out.println("No seas tonto");
				continue;
			}

			System.out.println("***TABLA DEL " + tabla + "***");
			for (int i = 0; i <= 10; i++) {
				System.out.println(tabla + " x " + i + " = " + (tabla * i));
			}

		} while (tabla != 0);

	}

}
