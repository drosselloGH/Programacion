//Crea un programa que declare un array con las siguientes temperaturas de las últimas dos
//semanas y devuelva la temperatura media

package hoja1;

import java.util.Scanner;

public class Ejer15b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double sumaTemperaturas = 0;

		for (double valor : temperaturas) {
			sumaTemperaturas += valor;
		}

		double media = sumaTemperaturas / temperaturas.length;

		System.out.println("La media de temperatura es: " + (sumaTemperaturas / temperaturas.length));

		
		//asi mostramos la media redondeada sin tener que hacer tanto cálculo
		//.2 indica cuantos decimales queremos ver
		System.out.printf("\nTemperatura media: %.2f ºC. %f", media, otraVariable);
		
	}

}
