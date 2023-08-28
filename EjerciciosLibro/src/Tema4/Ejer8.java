package Tema4;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el primer numero");
		int num1 = sc.nextInt();

		System.out.println("Escribe el segundo numero");
		int num2 = sc.nextInt();

		System.out.println("Operacion a realizar: \n(1. Sumar)\n(2. Restar)\n(3. Multiplicar)\n(4. Dividir)");
		int operacion = sc.nextInt();

		switch (operacion) {
		case 1: {
			System.out.println(sumar(operacion, num1, num2));
			break;
		}
		case 2: {
			System.out.println(restar(operacion, num1, num2));
			break;
		}
		case 3: {
			System.out.println(multiplicar(operacion, num1, num2));
			break;
		}
		case 4: {
			System.out.println(dividir(operacion, num1, num2));
			break;
		}
		}

	}

	private static int sumar(int operacion, int num1, int num2) {
		return num1 + num2;

	}

	private static int restar(int operacion, int num1, int num2) {
		return num1 - num2;

	}

	private static int multiplicar(int operacion, int num1, int num2) {
		return num1 * num2;

	}

	private static int dividir(int operacion, int num1, int num2) {
		return num1 / num2;
	}

}
