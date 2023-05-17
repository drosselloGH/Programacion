//Escribe un programa que pregunte las temperaturas de las últimas ocho horas y las muestre
//ordenadas de menor a mayor, usando el método de selección. Al final también indicará la
//temperatura menor y la mayor.

package hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int temperaturas[] = new int[4];

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Escribe una temperatura");
			temperaturas[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(temperaturas));
		

		// ORDENAMOS LAS TEMPERATURAS//

		int posMin;

		int aux;

		for (int i = 0; i < temperaturas.length -1; i++) {
			// la posicion minima sera la "i"
			posMin = i;

			//buscamos el valor mas bajo en el resto de posiciones
			//es "i+1", porque sino seria comparar la posicion 1 con la 1
			for (int j = i + 1; j < temperaturas.length; j++) {
				//si el valor de "j" es menor al de "posMin"
				if (temperaturas[j] < temperaturas[posMin]) {
					//"posMin" ahora tendrá el valor más bajo, el de "j"
					posMin = j;
				}

			}
			
			//para intercambiar los valores hay que usar una variable auxiliar
			aux = temperaturas[i];
			temperaturas[i] = temperaturas[posMin];
			temperaturas[posMin] = aux;
			
			System.out.println(Arrays.toString(temperaturas));

		}
		
		
		//POSICION MAS PEQUEÑA//
		
		System.out.println("Temperatura minima: "+temperaturas[0]);
		
		//POSICION MAS GRANDE//
		//para marcarla, hay que hacer un "array.lenght" (tamaño del array) y 
		//un "-1", porque sino saldremos del indice el array
		System.out.println("Temperatura mas alta: " + temperaturas[temperaturas.length -1]);

	}

}
