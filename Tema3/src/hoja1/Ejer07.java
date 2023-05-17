//7.- Crea un array de 10 elementos de tipo double llamado notas. Ve leyendo las diez notas desde la
//consola, mediante un bucle while, y guardándolas en el array. A continuación, muestra las diez
//notas.

package hoja1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float[] notas = new float[10];
		int i = 0;

		System.out.println("****Introduce 10 notas****\n");
		
		while (i < notas.length) {
			System.out.println("Escribe una nota");
			notas[i] = sc.nextFloat();
			i++;
		}
		for (int j = 0; j < notas.length; j++) {
			System.out.println("Nota " + (j + 1) + " = " + notas[j]);
		}

	}

}
