package Tema3;

import java.util.Iterator;

public class Ejer7 {

	public static void main(String[] args) {
		
		System.out.println("Multiplos de 7 inferiores a 100");
		
		for(int i = 7; i < 100; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
		}
		
	}
	
}
