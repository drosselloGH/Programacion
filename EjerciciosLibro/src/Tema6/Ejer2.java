package Tema6;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una frase: ");
		String frase1 = sc.nextLine();
		
		System.out.println("Escribe otra frase");
		String frase2 = sc.nextLine();
		
		if(frase1.strip().length() > frase2.strip().length()) {
			System.out.println("La primera frase es más larga");
		} else if(frase1.length() < frase2.length()) {
			System.out.println("La segunda frase es mas larga");
		} else {
			System.out.println("Son iguales");
		}

	}

}
