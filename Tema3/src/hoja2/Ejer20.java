//- Crea un programa que vaya pidiendo por la terminal los apellidos, el nombre y el sueldo de
//cuatro empleados de una empresa, y guardándolo como filas en un array bidimensional llamado
//nominas. A continuación muestra los datos por la pantalla en forma de tabla y calcula el salario total
//que paga la empresa cada mes
//Añade al programa anterior un bucle que busque el salario más bajo, e indique el nombre y
//apellidos del trabajador al que corresponde, así como la cantidad

package hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer20 {

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
		
		System.out.println();
		
		//preguntar sobre como saber la distancia correcta al mostrar el array		
		for (int fila = 0; fila < nominas.length; fila++) {
			for (int columna = 0; columna < nominas[fila].length; columna++) {
				System.out.printf("%-15s",nominas[fila][columna]);
			}
			System.out.println();
		}

		System.out.println("\nSalario total que se paga cada mes: " + sumaSalario+"\n");

		int filaMin = 0;
		int filaMax = 0;

		for (int fila = 1; fila < nominas.length; fila++) {
			if (Integer.parseInt(nominas[fila][2]) < Integer.parseInt(nominas[filaMin][2])) {
				filaMin = fila;
			} else if (Integer.parseInt(nominas[fila][2]) > Integer.parseInt(nominas[filaMax][2])) {
				filaMax = fila;
			}
		}

		System.out.println("El salario más bajo es de " + nominas[filaMin][1] + " " + nominas[filaMin][0]
				+ ", con un salario de " + nominas[filaMin][2] + " euros");
		System.out.println("El salario más alto es de " + nominas[filaMax][1] + " " + nominas[filaMax][0]
				+ ", con un salario de " + nominas[filaMax][2] + " euros");
	}

}
