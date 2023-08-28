package Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Longitud tabla: ");
		int longitud = sc.nextInt();
		
		System.out.println("Ultimo numero: ");
		int fin = sc.nextInt();
		
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));

	}
	
	private static int[] rellenaPares(int longitud, int fin) {
		//tabla creada
		int tablaPares[] = new int[longitud];
		
		//contador de en que posicion de la tabla nos encontramos
		int i = 0;
		
		while(i < tablaPares.length) {
			int num = (int) (Math.random()*fin+1);
			
			if(num % 2 == 0) {
				tablaPares[i] = num;
				i++;
			}
			
		}
		
		System.out.println(Arrays.toString(tablaPares));
		return tablaPares;
		
	}

}
