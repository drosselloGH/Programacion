package ejercicios;

import java.util.Scanner;

/**
 * Programa para calcular de forma recursiva el número hexadecimal de un número de base decimal
 * 
 * 
 * @author Daniel Rosselló
 * @version 1.0, 19 may 2023
 *
 */
public class Ejer03 {

	/**
	 * Método principal que arranca el programa.
	 * Pide al usuario que introduzca un número de base decimal y muestra el mismo número en base hexadecimal
	 * 
	 * @param args		array con los argumentos escritos en la terminal al invocar el programa
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un número de base decimal");
		int num = sc.nextInt();

		System.out.println("El numero " + num + " en hexadecimal es: " + aHex(num));

	}

	/**
	 * Método que convierte un numero decimal en uno hexadecimal
	 * 
	 * @param n		número decimal
	 * @return		cadena de caracteres en hexadecimal
	 */
	private static String aHex(int n) {

		//caso base
		if(n == 0) {
			return "";
			//si la divison da 0, no se mostrará el número
		} else if (n <= 9) {
			return "" + n;
			//si es mayor que 0, se mostrará el número
		}

		//sacamos el resto
		int resto = n % 16;
		
		//caso recursivo
		return aHex(n / 16) + "" + numResto(resto);
	}
	
	/**
	 * Le pasamos un número (el resto) y lo convierte en un caracter hexadecimal
	 * 
	 * @param num		qué número resto se le pasa
	 * @return			devuelve un caracter en hexadecimal
	 */
	private static char numResto(int num) {
		//lista de caracteres en hexadecimal
		char letras[] = {'0' ,'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		
		//devuelve la posición del array de los caracteres hexadecimales
		return (char) letras[num];
		
	}

}
