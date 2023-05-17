//Escribe un programa que guarde las siguientes temperaturas en un array y busque su máximo y
//mínimo. Además deberá indicar en qué posición del array están ese máximo y mínimo

package hoja2;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double temperaturas[] = {15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6};
		int i;
		
		int posMax = 0, posMin = 0;
		
		for(i = 0; i < temperaturas.length; i++) {
			if(temperaturas[i] > temperaturas[posMax]) {
				posMax = i;
			}else if(temperaturas[i] < temperaturas[posMin]) {
				posMin = i;
			}
			
		}
		System.out.printf("Temperatura máxima (%f) en la posicion %d\n", temperaturas[posMax], (posMax+1));
		System.out.println("Temperatura maxima "+temperaturas[posMax]+ " en la posicion "+(posMax +1));
		System.out.println("Temperatura mínima "+temperaturas[posMin]+ " en la posición "+(posMin +1));
		System.out.printf("Temperatura mínima (%f) en la posicion %d", temperaturas[posMin], (posMin+1));

	}

}
