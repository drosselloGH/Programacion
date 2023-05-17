//19.- Crea un programa que solicite al usuario los precios de cuatro objetos y devuelva el precio
//total.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float precioTotal = 0;

		for (int cantPrecios = 1; cantPrecios <= 4; cantPrecios++) {
			System.out.println("Escribe un precio");
			float precio = sc.nextFloat();
			precioTotal += precio;

		}
		System.out.println("Precio total " + precioTotal);

	}

}
