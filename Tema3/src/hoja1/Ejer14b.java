//Escribe programa que pregunte un numero entero y decir si es primo
//mostrar los numeros primos entre 2 y 100

package hoja1;

import java.util.Scanner;

public class Ejer14b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		final int MAX_PRIMO = 100000;
		
		System.out.println("NUMEROS PRIMOS ENTRE 2 Y 100");
		
		long tiempoInicio = System.currentTimeMillis();
		
		
		for(int i = 2; i <= MAX_PRIMO; i++) {
				//al poner el contador aqui, se pondrá a 0 cada vez que haya un i++
				int cantDiv = 0;
				for(int j = 1; j <= i; j++) {
					if(i % j == 0) {
						cantDiv++;
					}
					
				}
				if(cantDiv <= 2) {
					System.out.println(i);
				}
				
			}
			
		long tiempoActual = System.currentTimeMillis();	
		
		System.out.println("Tiempo transcurrido: " +(tiempoActual - tiempoInicio)+" ms");
		}

}
