//Programa que lea una palabra desde la terminal y te diga cuántas letras tiene

package cadenas;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una palabra");
		String palabra = sc.nextLine();
		
		System.out.println(palabra +" tiene "+palabra.length()+" letras");

	}

}
