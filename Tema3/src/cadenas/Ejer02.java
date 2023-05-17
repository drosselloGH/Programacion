//Programa que lea una contraseña y valide si cumple con una longitud mínima de 6 y
//máxima de 12.

package cadenas;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int MIN_LONGITUD = 6;
		final int MAX_LONGITUD = 12;
		
		System.out.println("Escriba una palabra");
		String palabra = sc.nextLine();
		
		if(palabra.length() >= MIN_LONGITUD && palabra.length() <= 12) {
			System.out.println("Cumple con la longitud necesaria");
		} else {
			System.out.println("No cumple con la longitud necesaria");
		}

	}

}
