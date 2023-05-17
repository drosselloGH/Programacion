package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un precio: ");
		float precio = sc.nextFloat();

		System.out.println("Cantidad de unidades compradas: ");
		int unidades = sc.nextInt();

		float precioTotal = precio * unidades;

		// hacemos las condiciones
		if (precioTotal > 75) {

			System.out.println("15 % de descuento");
			precioTotal = precioTotal - (15 * precioTotal / 100);

			System.out.println("Precio final: " + precioTotal);

		} else if (precioTotal <= 75) {

			System.out.println("5 % de descuento");
			precioTotal = precioTotal - (5 * precioTotal / 100);

			System.out.println("Precio final: " + precioTotal);

		}

	}

}
