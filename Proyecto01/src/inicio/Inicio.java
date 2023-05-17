package inicio;

import java.util.Scanner;

import geometria.Cilindro;

public class Inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("Escribe los datos del primer cilindro");
		int altura1 = sc.nextInt();
		int radio1 = sc.nextInt();
		Cilindro cl1 = new Cilindro(altura1, radio1);
		System.out.println("Area: " + cl1.getArea());
		System.out.println("Volumen: " + cl1.getVolumen());

		System.out.println("\nEscribe los datos del segundo cilindro");
		int altura2 = sc.nextInt();
		int radio2 = sc.nextInt();
		Cilindro cl2 = new Cilindro(altura2, radio2);
		System.out.println("Área: " + cl2.getArea());
		System.out.println("Volúmen: "+cl2.getVolumen());
		System.out.println("Datos del cilindro 2: "+cl2.toString());

		// Cilindro cil2 = new Cilindro(altura1, radio1);

	}

}
