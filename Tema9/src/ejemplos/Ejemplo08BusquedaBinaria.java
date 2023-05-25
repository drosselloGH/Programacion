package ejemplos;

public class Ejemplo08BusquedaBinaria {

	public static void main(String[] args) {

		int valores[] = { 5, 7, 10, 20, 35, 37, 40, 42 };
		int num = 10;

		System.out.println("\nPosicion de " + num + ": " + buscar(valores, num));

	}

	private static int buscar(int valores[], int num) {
		int posFin = valores.length - 1;

		int posMedio = (posFin + 0) / 2;

		int posInicio = 0;

		while (posInicio <= posFin) {
			System.out.println("Posicion fin: "+posFin);
			System.out.println("Posicion inicio: "+posInicio);
			System.out.println("Posicion medio: "+posMedio);

			if (num > valores[posMedio]) {
				posInicio = posMedio + 1;

			} else if (num == valores[posMedio]) {
				return posMedio;
			} else if (num < valores[posMedio]) {
				posFin = posMedio - 1;

			}
			posMedio = (posInicio + posFin) / 2;
			
		}
		return -1;
	}

}
