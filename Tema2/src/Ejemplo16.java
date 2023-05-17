//pedir una edad 

import java.util.Scanner;

public class Ejemplo16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("edad");
		int edad = sc.nextInt();

		sc.nextLine();		
		System.out.println("Nombre");
		String nombre = sc.nextLine();

		System.out.println("tu nombre es " + nombre + " y tienes " + edad + " años");

	}

}
