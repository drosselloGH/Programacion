package Tema4;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero de la sucesion de Fibonacci");
		int num = sc.nextInt();
		
		System.out.println(fibonacci(num));
		
	}
	
	private static int fibonacci(int n) {
		
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		}
		
		return fibonacci(n -1) + fibonacci(n -2);
		
	}

}
