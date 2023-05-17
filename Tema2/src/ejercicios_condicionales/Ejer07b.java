package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer07b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int secreto = (int) (Math.random() * 10 + 1); // creamos un numero aleatorio
		System.out.println(secreto);
		
		int numero;

		do { 
			System.out.println("Adivina el número secreto"); 
			numero = sc.nextInt();

			if (numero == secreto) { 
				System.out.println("Bien hecho, has acertado");

			} else { 
				System.out.println("Erróneo\n");

			}

		} while (numero != secreto);

	}
}