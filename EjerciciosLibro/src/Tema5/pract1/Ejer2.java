package Tema5.pract1;

import java.util.Scanner;

public class Ejer2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		presentacion();

		checklist();

	}

	private static void presentacion() {
		System.out.println("*** Misión Espacial Tripulada ***");
	}

	private static void checklist() {

		int combustible = 0, cargaBaterias = 0, comidaXDias = 0, agua = 0;

		boolean correcto = false;

		while (!correcto) {
			System.out.println("\nChecklist previo al lanzamiento");
			System.out.println("===================================================");
			System.out.print("Comustible (en m3)? ");
			combustible = sc.nextInt();
			System.out.print("Nivel de baterías (en %)? ");
			cargaBaterias = sc.nextInt();
			System.out.print("Comida (en dias)? ");
			comidaXDias = sc.nextInt();
			System.out.print("Agua (en litros)? ");
			agua = sc.nextInt();

			System.out.println("\nAnalizando informacion...");

			if (combustible >= 50 && cargaBaterias >= 95 && comidaXDias >= 5 && agua >= 50) {
				correcto = true;
			} else {
				System.out.println("Se han encontrado incidencias. Vuelva a revisar el checklist.");
			}

		}
		
		despegue(combustible, cargaBaterias, comidaXDias, agua);

	} 

	private static void despegue(int combustible, int baterias, int dias, int agua) {

		System.out.println("\n=========================================================");
		System.out.println("Los parámetros de la misión son válidos: ");
		System.out.println("Combustible: " + combustible + "m3. \nBaterías: " + baterias + " %.\nComida: " + dias
				+ " días.\nAgua: " + agua + " litros");
		System.out.println("\nDespegue permitido");
	}

}
