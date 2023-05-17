//Escribe una aplicación para una caja registradora. Irá pidiendo una serie de precios y los irá
//guardando en un array de 50 elementos (no es necesario que se rellene el array completo)
//Cada vez que se introduzca un precio, el programa comprobará si la suma supera el valor 50 (que
//estará guardado en una constante). A partir de ese momento, cada nuevo precio se guardará rebajado
//un 10%.
//Cuando el cajero escriba un valor negativo, el programa entenderá que ha terminado y mostrará la
//lista de precios y el total que hay que cobrar al cliente.

package hoja3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precios [] = new double [50];
		
		double sumaPrecio = 0;
		
		for (int i = 0; i < precios.length; i++) {
			System.out.println("Precio "+i+": ");
			precios[i] = sc.nextDouble();
			
				if(sumaPrecio > 50) {
					precios[i] = precios[i] - (precios[i] * 0.1);
				}
				
			if(precios[i] < 0) {
				break;
			}
			
			sumaPrecio += precios[i];
		}
		
		for (double d : precios) {
			if(d >= 0) {
				System.out.println(d);
			} else {
				break;
			}
			
		}
		
		System.out.println("Total a pagar: "+sumaPrecio+" €\nGracias por su compra");

	}

}
