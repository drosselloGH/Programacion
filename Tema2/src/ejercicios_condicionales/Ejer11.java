package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce precio de compra: ");
		float precio = sc.nextFloat();
		
		System.out.println("Introduce cantidad comprada: ");
		int cantidad = sc.nextInt();
		
		float precioTotal = precio * cantidad;
		
		if(precioTotal< 100) {
			System.out.println("No tienes derecho a descuento"); 
			
		} else if (precioTotal > 100 && precioTotal < 200) {
			System.out.println("Descuento de 10%");
			System.out.println(precioTotal - ((precioTotal * 10) / 100));
			
		} else if (precioTotal > 200) {
			System.out.println("Descuento de 15%");
			System.out.println(precioTotal - ((precioTotal * 15) / 100));
		
		}

	}
}