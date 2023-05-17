//1.- Escribe un programa que invente un nº aleatorio entre 1 y 10. El usuario tendrá que adivinarlo en
//tres intentos como máximo. Al finalizar el programa se le dirá si ha acertado el número y en cuántos
//intentos lo ha hecho. Utiliza while y break.

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numAleatorio = (int) (Math.random() * 10 + 1); // creamos el número aleatorio
		int cantIntentos = 1; //empezamos por un intento, evidentemente

		System.out.println(numAleatorio);
		System.out.println("Adivina el número secreto");
		int num = sc.nextInt();
			while (cantIntentos <= 3) { //mientras la cantidad de fallos sea inferior a 3...
				if (num == numAleatorio) { //si el numero es igual, acabamos
					System.out.println("Has acertado!");
					System.out.println("Cantidad de intentos: " + cantIntentos);
					break;
					
				} else {
					System.out.println("Error\n");
					System.out.println("Adivina el número secreto");
					num = sc.nextInt();
					cantIntentos++; //sumamos +1 a la cantidad de intentos realizados
				}
				
				if(cantIntentos == 3) { //cuando la cantidad de intentos sea 3
					System.out.println("Has perdido"); //habremos perdido el juego
					break; //y el bucle habrá acabado
				}
				
			}

	}

}