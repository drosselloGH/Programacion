package ejerRandom;

public class Recursividad6 {

	public static void main(String[] args) {
		
		int numeros[] = {6, 5, 9};
		int cantidad = numeros.length;
		
		System.out.println(buscarMenor(numeros, cantidad));
		
	}
	
	private static int buscarMenor(int numeros[], int longitud) {
		
		if(longitud == 1) {
			return numeros[0];
		}
		
		return Math.min(buscarMenor(numeros, longitud -1), numeros[longitud-1]);
	}
	
}
