import java.util.Arrays;

//como recorrer un array bidimensional

public class Ejemplo12 {

	public static void main(String[] args) {
		// creamos un array bidimensional de 4 filas x 3 columnas
		double medidas[][] = {
				//cada elemento del array es un valor del array "medidas"
				{8.5, 1020, 40},
				{14.2, 1021, 35},
				{11, 1022, 45},
				{7, 1023, 50}
		};
		
		// El array medidas tiene 4 posiciones, cada una es una fila
		System.out.println("num filas: "+medidas.length);
		
		//Medidas [0] es la primera fila de medidas. Su tamaño es igual al numero de columnas
		System.out.println("num columnas: "+medidas[3].length);
		
		//mostramos la primera fila
		//medidas[0][0]
		//medidas[0][1]
		//medidas[0][2]
		
		System.out.println("Fila 0:");
		
		for(int i = 0; i < medidas[0].length; i++) {
			System.out.print(medidas[0][i]+" ");
		}
		
		//mostramos la 1ra columna
		//medidas[0][0], [1][0], [2][0], [3][0]
		System.out.println("\nColumna 0");
		for (int i = 0; i < medidas.length; i++) {
			System.out.println(medidas[i][1]);
		}
		
		//mostrar la tabla entera
		
		System.out.println("\nRegistros meteorólogicos");
		
		System.out.println("============================");
		
		for (int fila = 0; fila < medidas.length; fila++) {
			System.out.println();
			for (int columna = 0; columna < medidas[fila].length; columna++) {
				System.out.print(medidas[fila][columna]+" \t");
			}
		}

	}

}
