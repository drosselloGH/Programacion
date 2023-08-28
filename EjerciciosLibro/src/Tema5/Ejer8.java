package Tema5;

import java.util.Arrays;

public class Ejer8 {

	public static void main(String[] args) {

		int longitud = (int) (Math.random() * 10 + 5);

		int numeros[] = new int[longitud];

		numeros = rellenar(numeros);

		System.out.println(Arrays.toString(numeros));

		separarTabla(numeros);

	}

	private static int[] rellenar(int[] t) {
		for (int i = 0; i < t.length; i++) {
			t[i] = (int) (Math.random() * 20 + 1);
		}

		return t;

	}

	private static void separarTabla(int[] t) {
		// inicializamos las tablas
		int pares[] = new int[0], impares[] = new int[0];

		for (int n : t) {
			if (n % 2 == 0) {
				pares = Arrays.copyOf(pares, pares.length + 1);
				// añadimos el numero al array
				pares[pares.length - 1] = n;
			} else {
				impares = Arrays.copyOf(impares, impares.length + 1);
				// añadimos el numero al array
				impares[impares.length - 1] = n;
			}
		}
		
		System.out.println("Tabla pares: "+Arrays.toString(pares));
		System.out.println("Tabla impares: "+Arrays.toString(impares));
		
	}

}
