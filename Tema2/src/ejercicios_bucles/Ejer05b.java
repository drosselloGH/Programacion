
package ejercicios_bucles;

import java.util.Scanner;

public class Ejer05b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("De qué número quieres sacar la tabla de multiplicar?");
		int tabla = sc.nextInt();

		int contador = 0;

		while (contador <= 10) {
			System.out.println(tabla + " x " + contador + " = " + (contador * tabla));
			contador++;
		}

	}

}
