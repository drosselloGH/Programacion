package Tema5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejer10 {

	public static void main(String[] args) {

		int t[] = new int[7];

		for (int i = 0; i < t.length; i++) {
			t[i] = (int) (Math.random() * 10 + 1);

		}

		int numBorrar = (int) (Math.random() * 10 + 1);

		System.out.println(Arrays.toString(t));
		System.out.println(numBorrar);

		System.out.println(Arrays.toString(eliminarMayores(t, numBorrar)));

	}

	private static int[] eliminarMayores(int t[], int valor) {

		// copia de la original
		int[] copia = Arrays.copyOf(t, t.length);

		// mediante un bucle "while" y un indice externo podemos estar en el bucle el
		// tiempo necesario
		int i = 0;

		while (i < copia.length) {
			if (copia[i] > valor) {
				copia[i] = copia[copia.length - 1];
				copia = Arrays.copyOf(copia, copia.length - 1);
			} else {
				i++;
			}
		}

		// en este caso, con el bucle "for", siempre se pasa al siguiente indice, guste
		// o no
//		for (int i = 0; i < copia.length; i++) {
//			if(copia[i] > valor) {
//				copia[i] = copia[copia.length -1];
//				copia = Arrays.copyOf(copia, copia.length -1);
//			}
//		}

		return copia;
	}

}
