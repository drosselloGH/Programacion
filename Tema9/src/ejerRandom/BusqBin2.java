package ejerRandom;

import java.util.Arrays;

public class BusqBin2 {

	public static void main(String[] args) {
		int numeros[] = {2, 6, 1, 90, 3, 51, 12};
		
		int numBuscar = 12;
		
		Arrays.sort(numeros);
		
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("La posición de "+numBuscar+" es: "+buscarNum(numeros, numBuscar, 0, numeros.length -1));
	}
	
	private static int buscarNum(int[] numeros, int numBuscar, int inicio, int fin) {
		//caso base
		if(inicio > fin) {
			return -1;
		}
		
		//punto enmedio del array
		int medio = (inicio + fin) / 2;
		
		
		//caso recursivo
		if(numeros[medio] > numBuscar) {
			return buscarNum(numeros, numBuscar, inicio, medio -1);
		} else if(numeros[medio] < numBuscar) {
			return buscarNum(numeros, numBuscar, medio +1, fin);
		} else {
			return medio;
		}
	}
	
}
