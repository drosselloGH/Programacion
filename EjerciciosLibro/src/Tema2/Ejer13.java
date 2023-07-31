package Tema2;

import java.util.Scanner;

/**
 * *
 * 
 * Preguntar una hora en el formato HH, MM, SS y decir qué hora será un segundo
 * más tarde
 * 
 * @author danie
 *
 */
public class Ejer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introducir horas: ");
		int h = sc.nextInt();
		
		System.out.print("Introducir minutos: ");
		int m = sc.nextInt();
		
		System.out.print("Introducir minutos: ");
		int s = sc.nextInt();
		
		System.out.println("hora actual ["+h+":"+m+":"+s+"]");
		
		s += 1;
		
		if(s == 60) {
			s = 0; 
			m += 1;
			if(m == 60) {
				m = 0;
				h += 1;
			}
		}
		
		System.out.println("hora actual +1 segundo ["+h+":"+m+":"+s+"]");

	}

}
