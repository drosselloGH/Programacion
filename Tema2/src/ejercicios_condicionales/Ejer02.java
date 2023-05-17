package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Precio del producto: ");
		// pedimos el precio
		float precio = sc.nextFloat();

		if (precio > 80) {
			System.out.println("Se le aplicará un descuento del 10%");

			precio = precio - 10 * precio /100;
			
			System.out.println("El precio es de " + precio);
		}
		
		sc.close();

	}

}
