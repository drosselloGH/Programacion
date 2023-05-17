/*22.- Crea un programa que pida un número entero por teclado, entre 1 y 10.
 *  Si el usuario escribe un número entero, se escribirá su valor en pantalla. 
 *  Si lo que escribe no es un entero, se mostará un mensaje de error.*/

package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número del 1 al 10");

		boolean tipoCorrecto = sc.hasNextInt();
		//de esta forma vemos si han introducido los datos correctos

		if (tipoCorrecto) { //si se da el caso de que es correcto
			int valorUsuario = sc.nextInt();
			//convertimos el numero del usuario en un valor de tipo INT
			
			System.out.println(valorUsuario);
			
		} else {
			System.out.println("Esos numeros no");
			
		}

	}

}
