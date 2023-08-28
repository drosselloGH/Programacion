package Tema3;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		int num = sc.nextInt();
		
		System.out.println(calcularFactorial(num));
		
	}
	
	private static int calcularFactorial(int n) {
		
		//caso base
		if(n == 1) {
			return 1;
		}
		
		//caso recursivo
		return n * calcularFactorial(n -1);
		
	}

}
