//17.- Crea un programa que pida un número y escriba la tabla de multiplicar de ese número.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabla de multiplicar: ");
		
		int tabla = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabla + " * " + i + " = " + (tabla*i));
		}

	}

}
