//24.- Amplía la aplicación anterior para que a medida que se van introduciendo las notas se vayan
//sumando (en una variable llamada suma). Al final, devolverá la nota media de esas notas.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sumaTotal = 0;
		int i;

		for (i = 0; i < 5; i++) {

			System.out.println("Escribe una nota");
			int nota = sc.nextInt();
			sumaTotal += nota;

			while (!(nota >= 0 && nota <= 10)) {
				System.out.println("Escribe una nota");
				nota = sc.nextInt();
			}

		}

		System.out.println("Suma total: " + sumaTotal);
		System.out.println("La media de notas es: " + (sumaTotal - i));

	}

}
