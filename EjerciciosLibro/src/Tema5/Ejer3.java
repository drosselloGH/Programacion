package Tema5;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos numeros quieres introducir?");
		int cantNum = sc.nextInt();
		
		int listaNumeros[] = new int[cantNum];
		
		System.out.println("** Introduce los numeros **");
		
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Numero "+(i +1));
			listaNumeros[i] = sc.nextInt();
		}
		
		/**
		 * Para mostrar los datos de forma inversa, se hace array.lenght -1,
		 * pues no existe la posicion que equivale a la longitud del array
		 */
		for (int i = listaNumeros.length -1; i >= 0; i--) {
			System.out.println(listaNumeros[i]);
		}
		
	}

}
