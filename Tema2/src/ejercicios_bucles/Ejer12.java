//12.- Modifica el programa anterior para que no aparezcan los múltiplos de 5 sino que, al final,
//simplemente se muestre la suma de todos ellos. Utiliza un bucle while.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		System.out.println("Múltiplos de 5 entre 1 y 1000");

		int num = 5;
		int sumaTotal = 0;
		
		while(num < 1000) {
			//if (num % 5 == 0)
			//System.out.println(num);
			num += 5;
			sumaTotal += num;
			System.out.println("Suma: " + sumaTotal);
			
		}
		System.out.println(sumaTotal);
		
	}

}