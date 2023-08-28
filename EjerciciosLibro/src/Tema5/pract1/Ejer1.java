package Tema5.pract1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int [10];
		
		System.out.println("Rellena los numeros");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		contarMultiplos(numeros);

	}
	
	private static void contarMultiplos(int [] t) {
		
		int multiplos3 = 0, multiplos7 = 0;
		
		for (int i = 0; i < t.length; i++) {
			if(t[i] % 3 == 0) {
				multiplos3++;
			}
			if(t[i] % 7 == 0) {
				multiplos7++;
			}
		}
		
		System.out.println("Multiplos de 3: "+multiplos3);
		System.out.println("Multiplos de 7: "+multiplos7);
	}

}
