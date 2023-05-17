//Añade al programa anterior la función de calcular cuántas temperaturas ha habido por encima
//de 12ºC

package hoja1;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double sumaTemperaturas = 0;
		int tempMayorQue12 = 0;

		//recorremos todo el array
		for (double valor : temperaturas) {
			//sumamos a la varible de suma, cada valor del array
			sumaTemperaturas += valor;
			//si se cumple esta condicion
			if(valor > 12) {
				//sumamos +1 a la cantidad de temperaturas > 12
				tempMayorQue12++;
			}
		}

		System.out.println("La media de temperatura es: " + (sumaTemperaturas / temperaturas.length));
		System.out.println("Ha habido "+tempMayorQue12+ " temperaturas mayor que 12 grados");

	}

}
