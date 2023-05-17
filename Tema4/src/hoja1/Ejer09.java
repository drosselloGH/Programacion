//Desarrolla un método que tome un array de números enteros y lo muestre ordenado

package hoja1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeros[] = new int [5];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Escriba un numero");
			numeros[i] = sc.nextInt();
		}
		
		ordenar(numeros);
		
		
	}
	
	static void ordenar (int[] numeros) {
		int posMin = 0;
		int aux;
		for (int i = 0; i < numeros.length -1; i++) {
			posMin = i;
			for (int j = i +1; j < numeros.length; j++) {
				if(numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}
			
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;
			
		}
		
		System.out.println(Arrays.toString(numeros));
	}

}
