package Tema6;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();
		
		vecesLetra(frase);
		
	}
	
	private static void vecesLetra(String frase) {		
		/**
		 * dado que las letras tienen un caracter unicode, el array tendra la longitud que tienen las letras del abecedario
		 */
		int veces[] = new int['z' - 'a' +1];
		
		frase = frase.toLowerCase();
		
		for (int i = 0; i < frase.length(); i++) {
			//evita tener en cuenta los espacios
			if(Character.isLetter(frase.charAt(i))) {
				//indica la posicion del array (letra) donde hay que sumar +1 a la cantidad de veces que aparece dicha letra
				/**
				 * EJ: posicion letra -> 6 (e)
				 *  la posicion de la letra en el array será la posicion indicada, menos 1
				 */
				veces[frase.charAt(i) - 'a']++;
			}
		}
		
		for(int i = 0; i < 'z' - 'a'+1; i++) {
			if(veces[i] != 0) {
				System.out.println("La letra "+(char)(i +'a')+" se repite "+veces[i]+ "veces");
			}
		}
		
		
		
	}

}
