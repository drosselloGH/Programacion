package Tema4;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero de inicio");
		int num1 = sc.nextInt();
		
		System.out.println("Escribe un numero de fin");
		int num2 = sc.nextInt();
		
		mostrarNumeros(num1, num2);
		
	}
	
	private static void mostrarNumeros(int inicio, int fin) {
		for(int i = inicio; i <= fin; i ++) {
			System.out.println(i);
		}
	}

}
