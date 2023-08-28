package Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer11 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Longitud contraseña? ");
		int longitud = sc.nextInt();

		int combiacion[] = generarCombinacion(longitud);
		int combinacionUsuario[] = new int[longitud];
		while (!esCorrecto(combiacion, combinacionUsuario)) {

			System.out.println(Arrays.toString(combiacion));

			combinacionUsuario = leerCombinacion(longitud);

			mayorMenor(combiacion, combinacionUsuario);

		}

		System.out.println("\nHas Ganado!!");

	}

	/**
	 * 
	 * @param longitud
	 * @return combinacion de la camara secreta
	 */
	private static int[] generarCombinacion(int longitud) {

		int combinacion[] = new int[longitud];

		for (int i = 0; i < combinacion.length; i++) {
			combinacion[i] = (int) (Math.random() * 5 + 1);
		}

		return combinacion;
	}

	/**
	 * 
	 * @param longitud
	 * @return tabla de la combinacion del usuario
	 */
	private static int[] leerCombinacion(int longitud) {

		System.out.println("\n** Escribe la combinacion de la camara secreta **");

		int combinacionUsuario[] = new int[longitud];

		for (int i = 0; i < combinacionUsuario.length; i++) {
			combinacionUsuario[i] = sc.nextInt();
		}

		return combinacionUsuario;

	}

	/**
	 * 
	 * @param combinacion
	 * @param jugador
	 * @return tabla indicando que elemento de la tabla "jugador" es correcto o no
	 */
	private static void mayorMenor(int[] combinacion, int[] jugador) {
		int i = 0;

		while (i < combinacion.length) {
			if (combinacion[i] > jugador[i]) {
				System.out.println("Mayor");
			} else if (combinacion[i] < jugador[i]) {
				System.out.println("Menor");
			} else if (combinacion[i] == jugador[i]) {
				System.out.println("Correcto");
			}

			i++;

		}
		
		System.out.println();

	}

	/**
	 * 
	 * @param secreta
	 * @param usuario
	 * @return devuelve si los arrays pasados son iguales o no
	 */
	private static boolean esCorrecto(int[] secreta, int[] usuario) {

		int i = 0;

		while (i < secreta.length) {
			if (secreta[i] != usuario[i]) {
				return false;
			} else {
				i++;
			}

		}

		return true;

	}

}
