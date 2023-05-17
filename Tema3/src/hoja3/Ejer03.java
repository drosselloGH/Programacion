//Crea un programa que tome los mismos datos que el anterior y los ordene de menor a mayor (sin
//calcular mínimo ni máximo).

package hoja3;

import java.util.Arrays;

public class Ejer03 {

	public static void main(String[] args) {
		double cotizaciones[] = { 47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7 };

		int posMin;
		double aux = 0;

		for (int i = 0; i < cotizaciones.length -1; i++) {
			posMin = i;
			for (int j = i + 1; j < cotizaciones.length; j++) {
				if (cotizaciones[j] < cotizaciones[posMin]) {
					posMin = j;
				}
			}

			aux = cotizaciones[i];
			cotizaciones[i] = cotizaciones[posMin];
			cotizaciones[posMin] = aux;

		}

		System.out.println(Arrays.toString(cotizaciones));

	}

}
