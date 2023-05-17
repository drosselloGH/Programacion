//13.- Crea un programa que rellene un array llamado potencias con las primeras 20 potencias de 2.
//Haz que después se muestren todos los valores mediante un bucle while.

package hoja1;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] pertenencias = new int[20];
		
		int i;
		
		for (i = 0; i < pertenencias.length; i++) {
			int potencia = (int) (Math.pow(2, i)) ;
			pertenencias[i] = potencia;
		}
		
		i = 0;
		while (i < pertenencias.length) {
			System.out.println(pertenencias[i]);
			i++;
		}

	}

}
