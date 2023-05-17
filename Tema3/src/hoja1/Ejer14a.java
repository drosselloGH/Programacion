//Escribe programa que pregunte un numero entero y decir si es primo

package hoja1;

import java.util.Scanner;

public class Ejer14a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		while (true) {
			int cantDiv = 0;
			System.out.println("Escribe un numero");
			int num = sc.nextInt();
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					cantDiv++;
				}
			}
			if(cantDiv <= 2) {
				System.out.println("Es primo\n");		
				
			} else {
				System.out.println("No es primo\n");
			}
			
		}

	}

}
