package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una nota (entre 1 y 10): ");
		int nota = sc.nextInt();
		
		if (nota < 5) {
			System.out.println("Insuficiente");
			
		} else if (nota == 5) {
			System.out.println("Suficiente");
			
		} else if (nota == 6) {
			System.out.println("Bien");
			
		} else if (nota == 7 || nota == 8) {
			System.out.println("Notable");
			
		} else {
			System.out.println("Sobresaliente");
			
		}
		
	}

}
