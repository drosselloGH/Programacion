//Escribe un programa que vaya preguntando y guardando en un array el nombre de un alumno y
//sus notas de exámenes, trabajos y actitud en un trimestre. Así para tres alumnos. A continuación
//mostrará una lista con el nombre de cada alumno y su nota de evaluación, que vendrá dada por la
//fórmula:
//N = (50⋅E+40⋅T+10⋅A)/100

package hoja2;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String notas[][] = new String[3][4];

		int E, T, A;

		//leemos todos los datos
		for (int fila = 0; fila < notas.length; fila++) {
			System.out.print("Nombre: ");
			notas[fila][0] = sc.next();

			System.out.println("Exámenes: ");
			notas[fila][1] = sc.next();

			System.out.println("Trabajos: ");
			notas[fila][2] = sc.next();

			System.out.println("Actitud: ");
			notas[fila][3] = sc.next();
			
		}
		
		System.out.println("Notas de evaluación");
		System.out.println("=================");

		//por cada nombre de la tabla
		for (int fila = 0; fila < notas.length; fila++) {
				//nota examenes
				E = Integer.parseInt(notas[fila][1]);
				//nota trabajos
				T = Integer.parseInt(notas[fila][2]);
				//nota actitud
				A = Integer.parseInt(notas[fila][3]);
				
				//media total
				int media =((50 * E) + (40* T) + (10* A))/100;
				
				System.out.println(notas[fila][0]+": " +media);
			
		}
	
	}

}
