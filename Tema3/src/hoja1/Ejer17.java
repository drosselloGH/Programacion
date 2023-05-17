//Escribe una aplicación que pida al usuario diez precios de productos. Después devolverá el
//precio total a pagar y el número de productos cuyo precio sea mayor de 10 euros

package hoja1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precios[] = new double[10];
		
		double sumaTotal = 0;
		
		int mayorQue10 = 0;
		
		for (int i = 0; i < precios.length; i++) {
			System.out.println("Escribe un precio");
			precios[i] = sc.nextDouble();
			
			sumaTotal += precios[i];
			
			if(precios[i]> 10) {
				mayorQue10++;
			}
			
		}	
		
		System.out.printf("Precio total: %.2f \n", sumaTotal);
		
		System.out.printf("Ha habido %d precios mayores que 10", mayorQue10);

	}

}
