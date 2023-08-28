package Tema4;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		int num = sc.nextInt();
		
		System.out.println("Es primo? "+esPrimo(num));
		
	}
	
	private static boolean esPrimo(int n) {
		int cantDivisiores = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				cantDivisiores++;
			}
			
			//si tiene mas de 2 divisores, no es primo
			if(cantDivisiores > 2) {
				return false;
			}
		}
		
		
		
		
		return true;
	}

}
