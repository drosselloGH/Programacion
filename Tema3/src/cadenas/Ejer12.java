//Programa que lee una frase y crea un array donde cada posición contiene una
//palabra.

package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una frase: ");
		String frase = sc.nextLine();
		
		//proceso para contar palabras
		
		int cantPalabras = 1;
		
		int inicio = 0;
		int fin = frase.indexOf(' ');
		
		while (fin != -1) {
			//contamos a partir de la siguiente posicion al espacio
			inicio = fin +1;
			//buscamos el nuevo espacio, a partir del siguiente caracter al espacio
			fin = frase.indexOf(' ', inicio);
			cantPalabras++;
		}
		
		System.out.println("Cant palabras: " + cantPalabras);

		String palabras[] = new String[cantPalabras];

		
		//meter las palabras en el array
		
		inicio = 0;
		fin = frase.indexOf(' ');
		
		int posNuevaPalabra = 0;
		while(fin != -1) {
			palabras[posNuevaPalabra] = frase.substring(inicio, fin);
			posNuevaPalabra++;
			
			inicio = fin+1;
			fin = frase.indexOf(' ', inicio);
		}
		palabras[posNuevaPalabra] = frase.substring(inicio);
		
		System.out.println(Arrays.toString(palabras));
		
	}

}
