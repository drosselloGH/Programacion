//11.- Escribe todos los múltiplos de 5 entre 1 y 1000. Utiliza un bucle while y haz que la variable
//contador se incremente de 5 en 5.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		System.out.println("Múltiplos de 5 entre 1 y 1000");

		int num = 5;
		
		while(num <= 1000) {
			if (num % 5 == 0)
			System.out.println(num);
			num += 5;
			
		}
		
	}

}
