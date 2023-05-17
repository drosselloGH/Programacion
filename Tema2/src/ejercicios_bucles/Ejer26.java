//26.- Crea un programa que vaya pidiendo cinco números para mostrar sus tablas de multiplicar. Si
//el número introducido es 1, el programa escribirá el mensaje "¡No seas tonto!" y se volverá a
//formular la pregunta.
//Utiliza la instrucción continue.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Que tabla de multipicar quieres saber?");
			int tabla = sc.nextInt();
			
			if (tabla == 1 ) {
				System.out.println("¡No seas tonto!");
				continue; //el continue hace que se salte la parte de código que sigue al continue
			} 
			
			System.out.println("\nTabla del " + i + "\n"); //si fuese continue, este apartado no se ejecutaria
			for (int j = 1; j <= 10; j++) {
				System.out.println(tabla + " * " + j + " = " + (tabla * j));
			}
			
		}

	}

}
