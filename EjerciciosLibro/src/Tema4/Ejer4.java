package Tema4;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe un numero");
		int num1 = sc.nextInt();
		
		System.out.println("Escribe otro numero");
		int num2 = sc.nextInt();
		
		System.out.println("El numero mayor es: "+mayor(num1, num2));
		
	}
	
	private static int mayor(int num1, int num2) {
		return Math.max(num1, num2);
	}
	
}
