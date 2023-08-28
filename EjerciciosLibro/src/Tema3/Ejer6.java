package Tema3;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero:");
		int num = sc.nextInt();
		
		mostrarNumeros(num);
		
	}

	private static void mostrarNumeros(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

}
