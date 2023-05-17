//10.- Crea un programa que lea los precios de hasta cien productos y los guarde en un array llamado
//compra. Mientras los precios se van pidiendo al usuario, si éste introduce el valor 0, el programa
//entenderá que se ha terminado la compra, y mostrará todos los precios introducidos hasta el
//momento (no las posiciones vacías).

package hoja1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float compra[] = new float[5];
		float precio = 0;

		for (int i = 0; i < compra.length; i++) {
			System.out.println("Introduce precio de la compra");
			// hacemos que cada indice de la tabla tenga el valor introducido
			compra[i] = sc.nextFloat();

			// si el valor introducido en la tabla es 0
			if (compra[i] == 0) {
				break;
			}
		}

		int contador = 0;

		for (int j = 0; j < compra.length; j++) {
			if (compra[j] == 0) {
				break;
			}
			System.out.println("El precio del producto " + (j + 1) + " es: " + compra[j]);
			contador++;
		}

	}
}
