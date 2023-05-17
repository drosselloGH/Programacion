//9.- Escribe un programa que lea desde la consola el enunciado de una pregunta y las cuatro posibles
//respuestas, guardando los cinco valores en un array llamado test. A continuación los mostrará cómo
//si fuera una pregunta de tipo test

package hoja1;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una pregunta: ");
		String pregunta = sc.nextLine();

		String[] test = new String[4];

		for (int i = 0; i < test.length; i++) {
			System.out.println("Opción " + (i + 1));
			test[i] = sc.nextLine();

		}
		
		char indice = 'a';
		
		System.out.println("****TEST****");
		System.out.println(pregunta);
		for (int i = 0; i < test.length; i++) {
			System.out.println("\t" + indice + ") " + test[i]);
			indice++;
		}

	}

}
