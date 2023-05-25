package ejemplos;

public class Ejemplo09BusquedaBinariaRecursiva {

	public static void main(String[] args) {

		int valores[] = { 5, 7, 10, 20, 35, 37, 40, 42 };
		int num = 10;

		System.out.println("\nPosicion de " + num + ": " + buscar(valores, num, 0, valores.length-1));

	}

	//i = inicio
	//f = fin
	private static int buscar(int valores[], int num, int i, int f) {
		//m = nmedio
		int m = (i + (f -1)) / 2;
		
		if (num == valores[m]) {
			return m;
		}
		
	}

}
