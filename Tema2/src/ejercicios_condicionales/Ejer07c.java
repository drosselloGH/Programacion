package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer07c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int secreto = (int)(Math.random()*10+1);
			System.out.println(secreto);
		
		int numero;
		
		do {
			System.out.println("Adivina el número secreto: ");
			numero = sc.nextInt();
			
			if(numero == secreto) {
				System.out.println("Correcto");
			} else {
				System.out.println("\nErróneo\n");
			}
			
		} while (numero != secreto);

	}

}