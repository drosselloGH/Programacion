package pract3PingPong1;

import java.util.Scanner;

public class Partido {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		mostrarPresentacion();

		System.out.println("¿Cuál es el numero de sets que debe ganar un jugador?");
		int numSets = sc.nextInt();

		/*
		 * se supone que se deben ganar al menos la mitad de los sets para ganar el
		 * partido. De modo que la cantidad de sets a jugar son el doble de los
		 * necesarios para ganar, menos 1
		 */

		int[][] marcador = new int[2][(numSets * 2) - 1];

		sc.nextLine();
		
		System.out.println(partidoTerminado(2, 2, numSets));
		

		System.out.println("¿Cómo se llama el jugador 1?");
		String jugador1 = sc.nextLine();

		System.out.println("¿Cómo se llama el jugador 2?");
		String jugador2 = sc.nextLine();
		System.out.println();
		
		leerResultado();

	}

	public static void mostrarPresentacion() {
		System.out.println("##############################################################");
		System.out.println("#                    TORNEO DE PING-PONG                     #");
		System.out.println("#                        NAVIDAD 2022                        #");
		System.out.println("##############################################################\n");

	}

	public static int leerResultado() {
		
		//leer una cadena, e ir haciendo parseInts, para que se puedan incluir letras
		String ganador = " ";

		// hacemos la pregunta las veces necesaria hasta que se de con
		// la respuesta necesaria
		while (ganador.equals("1") == false && ganador.equals("2") == false) {
			System.out.println("Ganador del punto (1-2)");
			ganador = sc.nextLine();
			// si la respuesta es 1 o 2, se acabará el bucle
			if (ganador.equals("1")|| ganador.equals("2")) {
				continue;
			}

		}
		return Integer.parseInt(ganador) -1;

	}

	public static boolean partidoTerminado(int setGanadosJugador1, int setGanadosJugador2, int numSets) {
		return (setGanadosJugador1 == numSets || setGanadosJugador2 == numSets);

	}

}
