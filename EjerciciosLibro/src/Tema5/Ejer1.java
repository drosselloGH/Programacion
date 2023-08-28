package Tema5;

import java.util.Arrays;

public class Ejer1 {

	public static void main(String[] args) {
		int numeros[] = new int[10];

		int sumaNumeros = 0;
		
		//hacemos que cada numero del array sea un numero aleatorio
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()*100+1);
			
			sumaNumeros += numeros[i];
			
		}
		
		System.out.println(Arrays.toString(numeros));
		System.out.println("Suma numeros del array: "+sumaNumeros);
		
	}
}
