//6.- Crea un programa que escriba todos los números pares menores de 200.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Todos los nuemeros pares menores de 200");
		
		for (int i = 1; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}

}
