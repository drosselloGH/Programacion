//2.- Añade al final del programa anterior el código necesario para que indique la puntuación obtenida
//por el jugador:
//• Si ha acertado en un intento → Recibe 10 puntos.
//• Si ha acertado en dos intentos → Recibe 5 puntos.
//• Si ha acertado en tres intentos → Recibe 2 puntos.
//• En otro caso → Recibe 0 puntos.

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numAleatorio = (int) (Math.random() * 10 + 1); // creamos el número aleatorio
		int intentos = 1; // empezamos por un intento, evidentemente

		System.out.println(numAleatorio);
		System.out.println("Adivina el número secreto");
		int num = sc.nextInt();

		while (intentos <= 3) { // mientras la cantidad de fallos sea inferior a 3...
			if (num == numAleatorio) { // si el numero es igual, acabamos
				System.out.println("Has acertado!");
				System.out.println("Cantidad de intentos: " + intentos);

				if (intentos == 1) {
					System.out.println("Has conseguido 10 puntos!");
				} else if (intentos == 2) {
					System.out.println("Has conseguido 5 puntos!");
				} else if (intentos == 3) {
					System.out.println("Has conseguido 2 puntos");
				}
				break; // si se da el caso de que el numero sea correcto, cerramos el bucle

			} else {
				System.out.println("Error\n");
				System.out.println("Adivina el número secreto");
				num = sc.nextInt();
				intentos++; // sumamos +1 a la cantidad de intentos realizados

			}

			if (intentos == 3 && num != numAleatorio) { // cuando la cantidad de intentos sea 3
				System.out.println("Has perdido"); // habremos perdido el juego
				System.out.println("Has conseguido 0 puntos");
				break; // y el bucle habrá acabado
			}

		}
		
	}

}