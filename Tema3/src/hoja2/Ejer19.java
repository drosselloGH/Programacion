//- Crea un programa que vaya pidiendo por la terminal los apellidos, el nombre y el sueldo de
//cuatro empleados de una empresa, y guardándolo como filas en un array bidimensional llamado
//nominas. A continuación muestra los datos por la pantalla en forma de tabla y calcula el salario total
//que paga la empresa cada mes

package hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nominas[][] = new String[4][3];

		int sumaSalario = 0;

		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.println("Escribe el apellido");
			nominas[fila][0] = sc.nextLine();

			System.out.println("Escribe el nombre");
			nominas[fila][1] = sc.nextLine();

			System.out.println("Escribe el sueldo");
			nominas[fila][2] = sc.nextLine();

			sumaSalario += Integer.parseInt(nominas[fila][2]);

		}

		for (int fila = 0; fila < nominas.length; fila++) {
			for (int columna = 0; columna < nominas[fila].length; columna++) {
				System.out.print(nominas[fila][columna] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Salario total que se paga cada mes: "+sumaSalario);

	}

}
