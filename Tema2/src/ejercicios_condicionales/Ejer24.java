/*24.- Escribe un programa que pida la edad del usuario. 
 * Si ésta es menor de 18 años, el valor de la variable mayorDeEdad será verdadero. 
 *Si no, será falso. Al final se mostrará este valor.*/

package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();

		/* VERSION 1 */
		boolean mayorEdad = (edad >= 18) ? true : false;
		// es como un condicional, pero usando un valor Booleano
		// if (edad > 18) --> la variable mayorEdad será true,
		// else, será falsa

		System.out.println("Eres mayor de edad? " + mayorEdad);

		/* VERSION 2 */
		String mayorEdad1 = (edad >= 18) ? "Eres mayor" : "Eres menor";

		System.out.println(mayorEdad1);

	}

}
