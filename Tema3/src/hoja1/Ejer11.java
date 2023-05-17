//11.- Crea un programa que almacene las órdenes que debe seguir un robot en un array de 1000
//elementos. Las órdenes son palabras escritas por el usuario en la consola como:
//• izquierda
//• derecha
//• arriba
//• abajo
//• matar
//El programa parará de pedir órdenes cuando el usuario escriba "ejecutar". Entonces mostrará la lista
//de comandos que debe seguir el robot.

package hoja1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ordenes[] = new String[1000];

		int i = 0;

		while (i < ordenes.length) {
			System.out.println("Orden: ");
			String orden = sc.nextLine();
			if (orden.toLowerCase().equals("izquierda") || orden.toLowerCase().equals("derecha")
					|| orden.toLowerCase().equals("arriba") || orden.toLowerCase().equals("abajo")
					|| orden.toLowerCase().equals("matar")) {
				ordenes[i] = orden;
				i++;
			} else if (orden.toLowerCase().equals("ejecutar")) {
				break;
			}
		}

		for (int j = 0; j < ordenes.length; j++) {
			if (ordenes[j] == null) {
				break;
			} else {
				System.out.println(ordenes[j]);
			}
		}

	}

}
