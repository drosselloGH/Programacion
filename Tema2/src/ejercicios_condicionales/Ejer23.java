/*23.- Modifica el programa anterior para que si además
 *  el número introducido es el 3, 
 *  se informe al usuario de que lo ha acertado.*/

package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número del 1 al 10");

		boolean tipoCorrecto = sc.hasNextInt();
		//comprovamos si el numero es del tipo correcto 

		if (tipoCorrecto) { //si es verdad pasa lo siguiente
			int valorUsuario = sc.nextInt(); 
			//los datos del usuario se convierten en el tipo INT 
			
			System.out.println(valorUsuario);
			
			if (valorUsuario == 3) {
				System.out.println("Has acertado");
			}
			
		} else {
			System.out.println("Esos numeros no");
			
		}
	}

}
