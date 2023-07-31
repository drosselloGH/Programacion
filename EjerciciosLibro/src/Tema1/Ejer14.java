package Tema1;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero decimal");
		
		double num = sc.nextDouble();
		
		int redondeado = (int) (num + 0.5);
		
		System.out.println("Numero redondeado: "+redondeado);
		
	}

}
