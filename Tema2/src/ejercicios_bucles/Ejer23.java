//23.- Escribe una aplicación que solicite cinco notas. Si el usuario escribe una nota que no está entre
//0 y 10 se le informará del error y se le volverá a pedir el dato.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Escribe una nota");
			nota = sc.nextInt();
						
			while (!(nota >= 0 && nota <= 10)) {
				System.out.println("Esa nota no vale. \nEscribe una nota");
				nota = sc.nextInt();
			}
			
		}

	}

}