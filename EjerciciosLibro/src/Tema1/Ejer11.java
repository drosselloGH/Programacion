package Tema1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double MPRECIO = 2.35;
		final double PPRECIO = 1.95;
		
		System.out.println("Semestre 1");
		
		System.out.print("Kilos de manzanas vendidas: ");
		float kManzanas1 = sc.nextFloat();
		
		System.out.print("Kilos de peras vendidas: ");
		float kPeras1 = sc.nextFloat();
		
		System.out.println("Semestre 2");
		
		System.out.print("Kilos de manzanas vendidas: ");
		float kManzanas2 = sc.nextFloat();
		
		System.out.print("Kilos de peras vendidas: ");
		float kPeras2 = sc.nextFloat();
		
		double importeManzanas = (kManzanas1 + kManzanas2) * MPRECIO;
		double importePeras = (kPeras1 + kPeras2) * PPRECIO;
		
		System.out.println("Importe anual total: " + (importeManzanas + importePeras));
	}

}
