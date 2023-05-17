//Programa que pide una frase y luego muestra la primera palabra

package cadenas;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una frase: ");
		
		String frase = sc.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) != ' ') {
				System.out.print(frase.charAt(i));
			} else {
				break;
			}
		}

	}

}
