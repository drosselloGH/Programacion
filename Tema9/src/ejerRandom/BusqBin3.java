package ejerRandom;

public class BusqBin3 {

	public static void main(String[] args) {
		
		int numeros[] = {23, 34, 35, 40, 44, 46, 50, 72, 81};
		
		int numBuscar = 34;
		
		System.out.println(busqueda(numeros, numBuscar, 0, numeros.length -1));
		
	}
	
	private static int busqueda(int numeros[], int numBuscar, int inicio, int fin) {
		
		//caso base
		if(inicio > fin) {
			//no se ha encontrado
			return -1;
		}
		
		int medio = (inicio + fin) / 2;
		
		if(numeros[medio] > numBuscar) {
			return busqueda(numeros, numBuscar, inicio, medio -1);
		} else if(numeros[medio] < numBuscar) {
			return busqueda(numeros, numBuscar, medio +1, fin);
		} else {
			return medio;
		}
	}
	
}
