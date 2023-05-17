//Escribe un método llamado celsius() que tome como argumento una temperatura en grados
//Fahrenheit y devuelva la temperatura en grados centígrados

package hoja1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba la temperatura en Fahrenheit");
		int temp = sc.nextInt();
		System.out.println(celsius(temp));
		

	}

	static double celsius(int temp) {
		
		
		//aplicamos la fromula del cambio de Fh a Cs
		double celsius = (temp - 32) * (5.0 / 9.0);
		
		return celsius;
	}

}
