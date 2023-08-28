package Tema5;

import java.util.Arrays;

public class InsercionOrdenada {

	public static void main(String[] args) {

		int original[] = { 1, 2, 3, 4, 6, 7, 8 };
		
		System.out.println(Arrays.toString(original));
		
		int nuevo = 5;

		//buscamos la posicion del numero que queremos insertar
		int indiceInsercion = Arrays.binarySearch(original, nuevo);
		
		//no se encuentra en la tabla
		if(indiceInsercion < 0) {
			//calcular donde deberia estar
			indiceInsercion = -indiceInsercion -1;
		}
		
		//creamos nueva tabla con una longitud +1 a la original
		int copia[] = new int[original.length +1];
		
		//copiamos los elementos hasta el hueco
		/*
		 * tabla origen
		 * posicion origen
		 * tabla destino
		 * posicion destino
		 * longitud (numero elementos copiados)
		 * 
		 * */
		System.arraycopy(original, 0, copia, 0, indiceInsercion);
		
		//copiamos los siguientes
		System.arraycopy(original, indiceInsercion, copia, indiceInsercion +1, original.length -indiceInsercion);
		
		copia[indiceInsercion] = nuevo;
		
		//convertimos la original con la copia
		original = copia;
		
		System.out.println("Posicion en la que deberia estar: "+indiceInsercion);
		
		System.out.println(Arrays.toString(original));

	}

}
