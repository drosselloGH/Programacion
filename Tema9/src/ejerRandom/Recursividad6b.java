package ejerRandom;

public class Recursividad6b {

	public static void main(String[] args) {
		
		int numeros[] = {6, 5, 9};
		
		System.out.println("El menor es: "+buscarMenor(numeros, numeros.length));
		
	}
	
	private static int buscarMenor(int numeros[], int longitud) {
		
		//caso base
		if(longitud == 1) {
			return numeros[0];
		}
		
		//caso recursivo
		return Math.min(buscarMenor(numeros, longitud -1), numeros[longitud -1]);
		
	}
	
}
