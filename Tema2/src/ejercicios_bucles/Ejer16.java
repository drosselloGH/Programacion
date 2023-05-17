//16.- Diseña un programa que invente un número aleatorio. A continuación pedirá al usuario que lo
//adivine. Si el usuario falla, entonces el programa le dará otra oportunidad. Una vez que el usuario
//adivina el número o falla tres veces, el programa termina.
//Utiliza un bucle do-while.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroAleatorio = (int) (Math.random() * 10 + 1); // creamos el numero aleatorio
		System.out.println(numeroAleatorio);
		
		int num;

		int contadorFallos = 0; // creamos el contador de fallos

		do {
			System.out.println("Adivina el numero aleatorio (1 - 10)");
			num = sc.nextInt();

			contadorFallos++;
			
		} while (contadorFallos < 3);
		
		if (num == numeroAleatorio) {
			System.out.println("Correcto");
			// contadorFallos = 4;
			
		} else {
			contadorFallos++;
		}

	}

}
