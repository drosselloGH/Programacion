//Diseña un programa que a partir de la siguiente tabla de temperaturas, proveniente del registro
//de un termostato, indique la posición de la primera medida menor que cero. En caso de que no
//hubiera ninguna temperatura negativa, se indicaría un valor de -1

package hoja3;

import java.util.Arrays;

public class Ejer04 {

	public static void main(String[] args) {

		double temperatura[] = { 3.2, 3.5, 7.2, 0.1, 1, 2.3, 5, 3.4, 4, 4, 4, 1.4, 2.5, 0.4, 3.6 };
		
		int tempMayorQue0 = -1;
		
		for (int i = 0; i < temperatura.length; i++) {
			if(temperatura[i] < 0) {
				tempMayorQue0 = i;
				break;
			}
		}
		
		System.out.println("Posicion de la primera temperatura inferior a 0º: "+tempMayorQue0);

	}

}
