//Escribe un programa que pida 10 precios de productos y los guarde en un array llamado
//productos. Después recorrerá el array hasta encontrar un precio menor que 0. Si lo encuentra
//escribirá el mensaje "Se ha encontrado un valor no válido en la posición x. El programa terminará"
//(x es la posición del array donde está ese dato). Si no lo encuentra, calculará la suma de todos los
//precios y la mostrará.
//Utiliza una variable semáforo llamada preciosCorrectos, que valdrá true si todos los precios son
//mayores o iguales a cero, y false si se encuentra un número negativo

package hoja2;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double productos[] = new double[5];

		// decios si los precios son > 0 no
		boolean preciosCorrectos = false;

		double sumaTotal = 0;

		int i;

		for (i = 0; i < productos.length; i++) {
			System.out.println("Escribe un precio");
			productos[i] = sc.nextDouble();

		}

		for (i = 0; i < productos.length; i++) {
			if (productos[i] < 0) {
				preciosCorrectos = false;
				break;
			} else {
				sumaTotal += productos[i];
				preciosCorrectos = true;

			}
		}

		if (preciosCorrectos) {
			System.out.println("La suma total de los precios es: " + sumaTotal + " euros");
		} else {
			System.out.println("Se ha encontrado un valor no válido en la posicion " + (i + 1));
		}
	}

}
