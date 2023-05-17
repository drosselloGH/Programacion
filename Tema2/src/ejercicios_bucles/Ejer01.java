//pedir un caracter y escribirlo 100 veces 

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un caracter");
		String frase = sc.nextLine();

		int count = 1;

		while (count <= 100) {
			System.out.println(count + ") " + frase);
			count++;

		}
	}

}
