package Tema5;

import java.util.Arrays;

public class Insercion {

	public static void main(String[] args) {
		int t[] = {1, 2, 3, 4, 5};
		
		//copiamos la tabla, y le añadimos un indice mas
		t = Arrays.copyOf(t, t.length +1);
		
		/*
		 * 
		 * asi insertamos los datos en la tabla 
		 * 
		 * t[t.lenght -1] = x
		 * 
		 * */
		
		System.out.println(Arrays.toString(t));
	}
	
	
	
}
