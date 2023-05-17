package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número de mes (del 1 al 4): ");
		int mes = sc.nextInt();
		
		if (mes == 1) {
			System.out.println("Enero");
		} else if (mes == 2) {
			System.out.println("Febrero");
		} else if (mes == 3) {
			System.out.println("Marzo");
		} else {
			System.out.println("Abril");
		}
		
	}

}