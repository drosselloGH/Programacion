//Programa que lee una frase y nos dice por cuántas palabras está formada

package cadenas;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una frase");
		String frase = sc.nextLine();

		int cantEspacios = 1;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				cantEspacios++;
			}
		}
		
		System.out.println("Hay "+(cantEspacios)+" palabras");

	}

}