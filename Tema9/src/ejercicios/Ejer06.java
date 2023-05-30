package ejercicios;

public class Ejer06 {

	public static void main(String[] args) {
		
		int numeros[] = {15, 10, 17, 20, 23, 7};
		int cantidad = numeros.length;
		
		System.out.println("El número más pequeño de la serie es: "+encontrarMenor(numeros, cantidad));
		
	}
	
	public static int encontrarMenor(int numeros[], int longitud) {
		//caso base
		if(longitud == 1) {
			return numeros[0];
		}

		//caso recursivo
		return Math.min(encontrarMenor(numeros, longitud -1), numeros[longitud -1]);
		
	}
	
}
