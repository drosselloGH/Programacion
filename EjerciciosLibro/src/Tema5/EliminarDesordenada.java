package Tema5;

import java.util.Arrays;

public class EliminarDesordenada {

	public static void main(String[] args) {

		int t[] = new int[5];

		for (int i = 0; i < t.length; i++) {
			t[i] = (int) (Math.random() * 5 + 1);
		}

		System.out.println(Arrays.toString(t));

		int numBorrar = (int) (Math.random() * 5 + 1);

		System.out.println(numBorrar);
		
		System.out.println(Arrays.toString(borrarMayor(t, numBorrar)));

	}

	private static int[] borrarMayor(int[] t, int valor) {

		int copia[] = Arrays.copyOf(t, t.length);

		//indicará en que posicion del array nos encontramos
		int indice = 0;

		//recorremos la tabla, desordenada
		while (indice < copia.length) {
			if (copia[indice] > valor) {
				//hacemos que esa posicion tenga el contenido del ultimo indice
				copia[indice] = copia[copia.length - 1];
				//copiamos la misma tabla, pero quitando el ultimo indice, pues esta repetido
				copia = Arrays.copyOf(copia, copia.length - 1);
			} else {
				indice++;
			}
		}
		
		return copia;

	}

}
