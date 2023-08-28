package Tema5;

import java.util.Arrays;

public class Copia {

	public static void main(String[] args) {
		int original[] = { 1, 2, 3, 4, 5 };
		int destino[];
		int copia[];
		
		//copia enteramente la tabla indicada y x cantidad de contenido
		destino = Arrays.copyOf(original, 3);
		
		System.out.println(Arrays.toString(destino));
		
		//copia la tabla indicada desde el inidce x hasta el el indice y (no inclusive)
		copia = Arrays.copyOfRange(original, 3, 9);
		
		System.out.println(Arrays.toString(copia));
		
	}

}
