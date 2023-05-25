package ejemplos;

public class Ejemplo09BusquedaBinariaRecursiva {

	public static void main(String[] args) {

		int valores[] = { 5, 7, 10, 20, 35, 37, 40, 42 };
		int num = 10;

		System.out.println("\nPosicion de " + num + ": " + buscar(valores, num, 0, valores.length - 1));

	}

	// i = inicio
	// f = fin
	private static int buscar(int valores[], int num, int i, int f) {
		// m = nmedio
		int m = (i + f) / 2;

		//mientras el inicio sea inferior o igual al fin
		while (i <= f) {			
			//si se encuentra el número en el array
			if (num == valores[m]) {
				return m;
			}
			//si el número es inferior al punto medio del array
			if (num < valores[m]) {
				//el fin del rango de búsqueda será una posición inferior al punto medio
				return buscar(valores, num, i, f = (m - 1));
			}
			//si el número es mayor que el punto medio del array
			if (num > valores[m]) {
				//el inicio del rango de búsqueda será una posición superior al punto medio
				return buscar(valores, num, i = (m + 1), f);
			}
		}
		//no se ha encontrado el número en el array
		return -1;

	}

}
