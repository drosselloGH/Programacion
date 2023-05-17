//Crea un método int max(int x, int y) que devuelva el mayor de los números x e y.
//Análogamente, crea el método int min(int x, int y)

package hoja1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("numero 1:");
		int x = sc.nextInt();
		
		System.out.println("numero 2:");
		int y = sc.nextInt();
		
		System.out.println("El numero mayor es "+max(x, y));
		System.out.println("El numero menor es "+min(x, y));

	}

	static int max(int x, int y) {
		return Math.max(x, y);
	}
	
	static int min (int x, int y) {
		return Math.min(x, y);
	}

}
