package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número 1: ");
		float num1 = sc.nextFloat();
		
		System.out.println("Número 2: ");
		float num2 = sc.nextFloat();
		
		System.out.println("Qué operación deseas hacer? \n1 --> sumar \n2 --> restar \n3 --> multiplicar\n4 --> dividir");
		int operacion = sc.nextInt();
		
		switch (operacion) {
		case 1:
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case 2: 
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case 4: 
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}
		
	}

}
