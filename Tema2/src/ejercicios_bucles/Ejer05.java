//5.- Escribe un programa que solicite un número al usuario y, a continuación, muestre la tabla de
//multiplicar de ese número.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número (mostrar su tabla de multiplicar)");
		int num = sc.nextInt();

		System.out.println("Tabla de multilpicar de " + num);

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));

		}

	}

}