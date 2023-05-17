//Programa que lee una frase desde el teclado y nos alerta de si contiene alguna palabra
//malsonante. Las palabras malsonantes las buscará en un array llamado palabrotas.

package cadenas;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palabrotas[] = { "imbécil", "puta", "estúpido", "comemierda" };

		System.out.println("Escriba una frase con palabras malsonantes");

		String frase = sc.nextLine();
		
		boolean hayPalabrotas = false;
		
		//convertimos la frase en minúsculas
		frase = frase.toLowerCase();
		
		//recorremos el array de palabrotas, mirando si aparece alguna en la frase
		for (int i = 0; i < palabrotas.length; i++) {
			//si es mayor que 0, indica que se ha encontrado una palabrota
			if(frase.indexOf(palabrotas[i]) >= 0) {
				System.out.println("El contenido no es correcto");
				hayPalabrotas = true;
				break;
			}
		}
		
		if(!hayPalabrotas) {
			System.out.println("El contenido es correcto");
		} 

	}

}
