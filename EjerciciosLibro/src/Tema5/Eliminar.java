package Tema5;

import java.util.Arrays;

public class Eliminar {

	public static void main(String[] args) {
		
		int t[] = {1, 2, 3, 7, 5, 6, 8};
		System.out.println(Arrays.toString(t));
		
		int indiceBorrado = Arrays.binarySearch(t, 7);
		
		System.out.println(indiceBorrado);
		
		//encontrado
		if(indiceBorrado != -1) {
			//hacemos que el numero en la posicion indicada tenga el contenido del último numero (habra dos valores repetidos)
			t[indiceBorrado] = t[t.length -1];
			System.out.println(Arrays.toString(t));

			//copiamos la tabla, quitando la ultima posicion
			t = Arrays.copyOf(t, t.length-1);

			System.out.println(Arrays.toString(t));
		}
		
		/*PARA ELIMINAR EN UNA TABLA DESORDENADA, CONVIENE HACER UNA BUSQUEDA SECUENCAIAL
		 * SI ES UNA TABLA ORDENADA, UNA BUSQUEDA BINARIA
		 * 
		 * */
		
	}
	
}
