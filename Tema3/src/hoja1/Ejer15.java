//Crea un programa que declare un array con las siguientes temperaturas de las últimas dos
//semanas y devuelva la temperatura media

package hoja1;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double sumaTemperaturas = 0;

		for (double valor : temperaturas) {
			sumaTemperaturas += valor;
		}

		double media = sumaTemperaturas / temperaturas.length;

		System.out.println("La media de temperatura es: " + (sumaTemperaturas / temperaturas.length));

//		//redondeamos el numero a dos decimales:
//		multipliocaos por 100, redondeado, y lo dividimos entre 100.0
		media = (Math.round(media * 100))/100.0;
		System.out.println(media);
		
	}

}
