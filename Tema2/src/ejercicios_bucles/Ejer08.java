//8.- Crea un programa que muestre todos los números impares menores de 200

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		while (num < 200) {
			System.out.println(num);
			num += 2;
		}
		

	}

}
