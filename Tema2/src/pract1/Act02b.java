package pract1;

import java.util.Scanner;

public class Act02b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double precioEstancia = 20;
		
		
		System.out.println("Precio estancia: " + precioEstancia + " euros");
		System.out.print("Cantidad introducida: ");
		double cantAbonada = sc.nextDouble();
		
		double resto = precioEstancia - cantAbonada;
		
		while (cantAbonada < resto) {
			System.out.println("Precio estancia: " + resto + " euros");
			System.out.print("Cantidad introducida: ");
			cantAbonada = sc.nextDouble();
			resto = precioEstancia - cantAbonada;
		}
		
//		do {
//			System.out.println("Precio estancia: " + PRECIO_ESTANCIA + " euros");
//			System.out.print("Cantidad introducida: ");
//			cantAbonada = sc.nextDouble();
//			//precioEstancia = precioEstancia - cantAbonada;
//			
//		} while (cantAbonada != PRECIO_ESTANCIA);

	}

}
