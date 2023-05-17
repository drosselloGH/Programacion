package pract3PingPong;

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

		System.out.println("¿Cómo se llama el jugador 1?");
		String jugador1 = sc.nextLine();

		System.out.println("¿Cómo se llama el jugador 2?");
		String jugador2 = sc.nextLine();

		// recorremos todos los sets
//		int setActual = 0;
		for (int setActual = 0; setActual < marcador[0].length; setActual++) {
			for (int puntos = 0; puntos <= 11; puntos++) {
				mostrarMarcador(marcador, setActual, jugador1, jugador2);
				
			}

		}
	}

	public static void mostrarPresentacion() {
		System.out.println("##############################################################");
		System.out.println("#                    TORNEO DE PING-PONG                     #");
		System.out.println("#                        NAVIDAD 2022                        #");
		System.out.println("##############################################################");
		System.out.println();
	}

	public static int leerResultado() {
		int ganador;

		// hacemos la pregunta las veces necesaria hasta que se de con
		// la respuesta necesaria
		while (true) {
			System.out.println("Ganador del punto (1-2)");
			ganador = sc.nextInt();
			// si la respuesta es 1 o 2, se acabará el bucle
			if (ganador == 1 || ganador == 2) {
				return ganador - 1;
			}

		}

	}

	public static boolean partidoTerminado(int setGanadosJugador1, int setGanadosJugador2, int numSets) {
		return (setGanadosJugador1 == numSets || setGanadosJugador2 == numSets);

	}

	public static void mostrarMarcador(int marcador[][], int setActual, String jugador1, String jugador2) {
		int puntuacionMax = 11;

		while (!setTerminado(marcador, setActual)) {
			// sabemos qué jugador ha hecho punto
			int resultado = leerResultado();

			// sumamos un punto al jugador que haya hecho punto
			// punto del jugador (fila 0)
			if (resultado == 0) {
				marcador[0][setActual] += 1;
				// punto del jugador 2 (fila 1)
			} else if (resultado == 1) {
				marcador[1][setActual] += 1;
			}

			// mostramos el nombre del jugador 1
			System.out.print(jugador1 + "\t");
			// recorremos los sets realizados hasta el actual
			for (int i = 0; i < marcador[0][setActual]; i++) {
				// mostramos los puntos de cada set del jugador 1
				System.out.print(marcador[0][i]);
			}
			System.out.println();
			// mostramos el nombre del jugador 2
			System.out.print(jugador2 + "\t");
			// recorremos los sets ralizados hasta el actual
			for (int i = 0; i < marcador[1][setActual]; i++) {
				// mostramos los puntos de cada set del jugador 2
				System.out.print(marcador[1][i]);
			}
			System.out.println();
		}

	}

	public static boolean setTerminado(int[][] marcador, int setActual) {
		// comprobamos si un jugador ha llegado a 11 puntos con una ventaja de 2 puntos
		// sobre el rival
		return (marcador[0][setActual] == 11 || marcador[1][setActual] == 11)
				&& (marcador[0][setActual] - marcador[1][setActual] >= 2);
	}

	public static void mostrarResultado(int setGanadosJugador1, int setGanadosJugador2, String jugador1,
			String jugador2) {
		// si el jugador 1 tiene más sets ganados que el jugador 2, el primero habrá
		// ganado
		if (setGanadosJugador1 > setGanadosJugador2) {
			System.out.println("Fin del partido. Vencedor: " + jugador1);
		}
		// si no se ha dado el caso, habrá ganado el jugador 2
		System.out.println("Fin del partido. Vencedor: " + jugador2);

	}

}
