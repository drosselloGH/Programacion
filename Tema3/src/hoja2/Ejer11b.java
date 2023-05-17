//Crea una aplicación que ordene de menor a mayor la lista de edades de los diez alumnos de un
//curso de Desarrollo de Aplicaciones Web. Estas edades se pedirán por consola
//ordenando de mayor a menor

package hoja2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejer11b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int edades[] = new int[8];

		// guardamos todas las edades en un array
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Escribe una edad");
			edades[i] = sc.nextInt();

		}

		System.out.println(Arrays.toString(edades));

		int aux;
		
		//cual va a ser el indice con el valor mas alto
		int posMax;

		for (int i = 0; i < edades.length; i++) {
			//asumimos que el indice con el valor mas alto sera "i"
			posMax = i;

			for (int j = i + 1; j < edades.length; j++) {
				if(edades[j] > edades[posMax]) {
					//"posMax" tendra el indice "j", porque es mas alto
					posMax = j;
				}
			}
			
			aux = edades[i];
			edades[i] = edades[posMax];
			edades[posMax] = aux;
			
			System.out.println(Arrays.toString(edades));
		}
		

	}

}
