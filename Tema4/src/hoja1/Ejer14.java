//Crea un método que tome como parámetro un entero representando un año, y devuelva true o
//false indicando si es bisiesto o no

package hoja1;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un año");
		int año = sc.nextInt();
		System.out.println("Es bisiesto: " + esBisiesto(año));

	}

	static boolean esBisiesto(int año) {

		if ((año % 4 == 0) && (año % 100 != 0 || año % 400 == 0)) {
			return true;
		}
		return false;

	}

}
