//Crea un método que tome un número decimal y devuelva su cuadrado

package hoja1;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número decimal");
		double num = sc.nextDouble();
		System.out.println(cuadrado(num));
		
	}

	static double cuadrado(double num) {
		
		return Math.pow(num, 2);
		
	}

}
