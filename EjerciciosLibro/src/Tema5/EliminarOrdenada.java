package Tema5;

import java.util.Arrays;

public class EliminarOrdenada {

	public static void main(String[] args) {

		int t[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int borrar = 6;
		System.out.println(Arrays.toString(t));

		int indiceBorrado = Arrays.binarySearch(t, borrar);

		System.out.println("Posicion del numero a borrar: " + indiceBorrado);

		if (indiceBorrado >= 0) {
			System.arraycopy(t, indiceBorrado + 1, t, indiceBorrado, t.length - indiceBorrado - 1);
			t = Arrays.copyOf(t, t.length - 1);
			System.out.println(Arrays.toString(t));
		}

	}

}
