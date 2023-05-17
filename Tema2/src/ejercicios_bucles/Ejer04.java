//.- Escribe una aplicación que pregunte al usuario un número entre 1 y 5. Si responde "3", se le
//felicitará por haber acertado. Si no, se le seguirá pidiendo más números.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero (entre 1 y 5)");
		int num = sc.nextInt();

		while (num != 3) {
			System.out.println("Escribe un numero (entre 1 y 5)");
			num = sc.nextInt();
		}

		System.out.println("Enhorabuena, has acertado");

		sc.close();
	}

}
