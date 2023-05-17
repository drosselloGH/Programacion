package hoja1;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		System.out.println("El cubo es "+cubo());

	}
	static double cubo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número decimal");
		double num = sc.nextDouble();
		return Math.pow(num, 3);
	}

}
