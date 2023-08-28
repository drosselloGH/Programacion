package Tema3;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aprobado = 0, condicionados = 0, suspensos = 0;
		
		for(int i = 0; i <= 5; i++) {
			System.out.println("Escribe la nota del alumno: "+i);
			int nota = sc.nextInt();
			
			if(nota < 4) {
				suspensos++;
			} else if(nota == 4){
				condicionados ++;
			} else {
				aprobado++;
			}
			
		}
		
		System.out.println("Alumnos aprobados: "+aprobado);
		System.out.println("Alumnos condicionados: "+condicionados);
		System.out.println("Alumnos suspensos: "+suspensos);
		
	}

}
