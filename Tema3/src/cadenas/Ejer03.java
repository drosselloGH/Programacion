//Programa que pide una frase y luego la muestra del revés (letra a letra).

package cadenas;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		String frase = sc.nextLine();
		
		System.out.println("=========");
		System.out.println("FRASE AL REVÉS");
		System.out.println("=========");
		
		//es "-1" porque no puede ser la distancia total de la palabra
		//intentariamos acceder a una posicion que no existe
		for (int i = frase.length() -1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}

	}

}
