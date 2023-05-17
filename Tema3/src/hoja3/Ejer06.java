//Escribe un programa que lea desde consola los salarios de los 10 empleados de un pequeña
//empresa y los vaya guardando en un array. A continuación el programa calculará y mostrará por
//pantalla el salario mínimo, máximo y medio de los empleados. Así como la cantidad de empleados
//que cobran más de 1500 € mensuales

package hoja3;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int salarios [] = new int [10];
		
		int muchoDinero = 0;
		
		int min = 0;
		int max = 0;
		
		int sumaSalarios = 0;
		
		for (int i = 0; i < salarios.length; i++) {
			System.out.println("Salario");
			salarios[i] = sc.nextInt();
			
			sumaSalarios += salarios[i];
			
			if(salarios[i] > 1500) {
				muchoDinero++;
			}
			
			if(salarios[i] > salarios[max]) {
				max = i;
			} else if(salarios[i] < salarios[min]){
				min = i;
			}
			
		}
		
		System.out.println("Salario minimo "+ salarios[min]);
		System.out.println("Salario maximo "+ salarios[max]);
		
		System.out.println("Hay "+muchoDinero+" empleados que cobran mas de 1500 euros");
		
		System.out.println("Salario medio: "+(sumaSalarios / salarios.length));
		
	}

}
