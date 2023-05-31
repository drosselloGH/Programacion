package ejerRandom;

public class BusqBin {

	public static void main(String[] args) {
		
		int lista[] = {5, 7, 10, 20, 35, 37, 40, 42};
		int num = 42;
		
		System.out.println(busqueda(lista, num, 0, lista.length -1));
		
	}
	
	private static int busqueda(int lista[], int num, int inicio, int fin) {
		//caso base
		if(inicio > fin) {
			// no se encuentra
			return -1;
		}
		
		//punto medio
		int medio = (inicio + fin) / 2;
		
		if(lista[medio] > num) {
			return busqueda(lista, num, inicio, medio -1);
		} else if(lista[medio] < num) {
			return busqueda(lista, num, medio +1, fin);
		} else  {
			return medio;
		}
	}
	
}
