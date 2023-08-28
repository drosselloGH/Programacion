package Tema5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Ejer4 {

	public static void main(String[] args) {
		
		int numeros[] = {3, 2, 5, 1, 4};
		
		System.out.println(maximo(numeros));
		
	}
	
	private static int maximo(int numeros[]) {
		int posMin, aux;
		for (int i = 0; i < numeros.length; i++) {
			//ponemos que la posicion minima simpre es I
			posMin = i;
			//miramos el sigiente numero de I
			for (int j = i +1; j < numeros.length; j++) {
				if(numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}
			
			//ordenamos los numeros
			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;
			
		}
		//mostramos el numero en la ultima posicion, el mas grande
		return numeros[numeros.length-1];
	}
	
}
