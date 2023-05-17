//3.- Escribe una aplicación que pregunte repetidamente un número entero hasta 
//que el usuario escriba un valor entre 1 y 10. 
//A continuación el programa escribirá un mensaje informando del número introducido.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer3semaforo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		boolean rangoCorrecto = false; // asumimos que le rango va a ser incorrecto

		while (!rangoCorrecto) {
			System.out.println("Escribe un número");
			num = sc.nextInt();

			rangoCorrecto = (num < 1 || 10 < num) ? false : true;

		}

		System.out.println("Has escrito el numero  " + num);
	}
}