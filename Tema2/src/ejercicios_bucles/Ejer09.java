//9.- Escribe un programa que calcule el resto de una división entre enteros con el procedimiento de ir
//restando repetidamente el divisor del dividendo hasta que el resultado es menor que el divisor.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un dividendo");
		int dividendo = sc.nextInt();

		System.out.println("Escribe un divisor");
		int divisor = sc.nextInt();
		
		int resto = dividendo - divisor;
		
		if (dividendo >= divisor) {
			while (resto > divisor) {
				resto = resto - divisor;
				
			}
			
		} else {
			resto = dividendo;
		}

		System.out.println("El resto es: " + resto);

	}

}
