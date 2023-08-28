package Tema5;

import java.util.Arrays;

public class Ejer12 {

	public static void main(String[] args) {
		
		int t[][] = new int [5][5];
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				t[i][j] = 10 * i +j;
			}
		}
		
		
		//de esta forma mostramos todo el array bidimensional
		System.out.println(Arrays.deepToString(t));
		
		for(int fila[] : t) {
			for(int columna : fila) {
				System.out.print(columna + " ");
			}
			System.out.println();
		}
		
	}  
	
}
