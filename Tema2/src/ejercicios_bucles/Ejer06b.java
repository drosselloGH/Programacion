//6.- Crea un programa que escriba todos los números pares menores de 200.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer06b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 0;
		int num = 2;

		while (num < 200) {
			System.out.println(contador + ") " + num);
			num += 2; //sumamos +2 a numero
			contador++;

		}

	}

}
