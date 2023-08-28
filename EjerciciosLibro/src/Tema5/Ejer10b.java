package Tema5;

import java.util.Arrays;

public class Ejer10b {

	public static void main(String[] args) {

		int t[] = new int[7];

		for (int i = 0; i < t.length; i++) {
			t[i] = (int) (Math.random() * 10 + 1);

		}

		int numBorrar = (int) (Math.random() * 10 + 1);

		System.out.println(Arrays.toString(t));
		System.out.println(numBorrar);

		System.out.println(Arrays.toString(eliminarMayores(t, numBorrar)));
		
//		System.out.println(buscarPosicion(t, numBorrar));

	}

//	private static int buscarPosicion(int[] t, int valor) {
//
//		int posicion = 0;
//
//		while (posicion < t.length && t[posicion] != valor) {
//			posicion++;
//		}
//
//		if (posicion < t.length) {
//			return posicion;
//		} else {
//			return -1;
//		}
//
//	}

	private static int[] eliminarMayores(int[] t, int valor) {

		int[] copia = Arrays.copyOf(t, t.length);
		int i = 0;

		while (i < copia.length) {
			if(copia[i] > valor) {
				copia[i] = copia[copia.length -1];
				copia = Arrays.copyOf(copia, copia.length -1);
			} else {
				i ++;
			}
		}

		return copia;
	}

}
