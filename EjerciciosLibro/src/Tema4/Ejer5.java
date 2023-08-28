package Tema4;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un caracter");
		String letra = sc.next();
		
		System.out.println("Es vocal? "+esVocal(letra));
		
	}
	
	private static boolean esVocal(String letra) {
		
		//Convertimos la cadena en un caracter
		char caracter = letra.charAt(0);
		
		if(caracter == 'a' || caracter == 'e'|| caracter == 'i'|| caracter == 'o'|| caracter == 'u') {
			return true;
		}
		
		return false;
	}

}
