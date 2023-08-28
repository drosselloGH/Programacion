package Tema5;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.Port;

public class Ejer9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int programadores[] = new int[5];

		System.out.println("PUNTUACIONES PROGRAMADORES");

		for (int i = 0; i < programadores.length; i++) {
			System.out.println("Programador " + (i + 1));
			programadores[i] = sc.nextInt();
		}

		Arrays.sort(programadores);

		System.out.println(Arrays.toString(programadores));

		System.out.println("\nPUNTUACIONES PROGRAMADORES DE EXHIBICIÓN");
		int puntuacion = sc.nextInt();

		while (puntuacion != -1) {
			// en que posicion se encontraria
			int pos = Arrays.binarySearch(programadores, puntuacion);
			int indiceInsercion;

			if (pos < 0) {
				// en que posicion hay que insertar
				indiceInsercion = -pos - 1;
			} else {
				indiceInsercion = pos;
			}

			int copia[] = new int[programadores.length + 1];
			// copiamos los terminos antes del "hueco"
			System.arraycopy(programadores, 0, copia, 0, indiceInsercion);
			// copiamos los elementos desplazados tras el "hueco"
			System.arraycopy(programadores, indiceInsercion, copia, indiceInsercion + 1,
					programadores.length - indiceInsercion);

			// asignamos el nuevo elemento
			copia[indiceInsercion] = puntuacion;

			programadores = copia;

			System.out.println("Programador de exhibición: ");
			puntuacion = sc.nextInt();

		}

		System.out.println("Puntuación final: " + Arrays.toString(programadores));

	}

}
