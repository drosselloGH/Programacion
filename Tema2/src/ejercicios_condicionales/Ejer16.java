package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una nota (1 - 10)");
		float nota = sc.nextFloat();
		
		if(nota < 4) {
			System.out.println("ROJO");
			
		} else if (nota >= 4 && nota < 5) {
			System.out.println("VERDE");
			
		} else {
			System.out.println("AZUL");
			
		}
		
	}

}
