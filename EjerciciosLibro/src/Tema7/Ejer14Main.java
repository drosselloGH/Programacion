package Tema7;

import java.util.Arrays;

public class Ejer14Main {

	private int [] tablaEnteros = new int[0];
	
	public static void main(String[] args) {
		
		Ejer14Main m = new Ejer14Main();
		
		for (int i = 1; i <= 10; i++) {
			//aunque no sea estatico, accedemos a el al haber creado un objeto del tipo de la clase
			m.insertarFin(i);
		}
		
		System.out.println(Arrays.toString(m.tablaEnteros));
		
	}
	
	public void insertarFin(int num) {
		tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length +1);
		tablaEnteros[tablaEnteros.length -1] = num;
	}
	
}
