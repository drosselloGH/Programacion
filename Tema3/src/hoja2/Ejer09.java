//Crea un programa que muestre los siguientes precios (guardados en un array llamado precios)
//ordenados de menor a mayor, usando el método de selección

package hoja2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejer09 {

	public static void main(String[] args) {
		int precios[] = {43, 15, 58, 15, 44, 10, 62, 90, 80, 56};
		
		//creamos una variable auxiliar, para intercambiar los valores
		int aux; 
		
		//indicamos la posicion minima de un array
		int posMin;
		
		System.out.println(Arrays.toString(precios));
		
		for (int i = 0; i < precios.length -1; i++) {
			//hacemos que la posicion minima sea "i"
			posMin = i;
			
			for (int j = i +1; j < precios.length; j++) {
				if(precios[j] < precios[posMin]) {
					posMin = j;
				}
			}
			
			//ahora posMin indica la posicion mas pequeña del array
			
			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;
			
			System.out.println(Arrays.toString(precios));
			
		}
		

	}

}
