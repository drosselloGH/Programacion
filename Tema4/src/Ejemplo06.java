// Ejemplo donde vemos que return puede ser usado varias veces en el mismo metodo

public class Ejemplo06 {

	public static void main(String[] args) {

		int[] edades = { 30, 40, 45, 20, 62, 70 };

		System.out.println("La posicion es " + buscar(edades, 40));
	}

	static int buscar(int[] edades, int edad) {

		for (int i = 0; i < edades.length; i++) {
			if (edades[i] == edad) {
				return i;

			}
		}

		return -1;

	}

}