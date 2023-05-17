//10.- Trivial. Escribe una aplicación que haga una pregunta y muestre un menú con cuatro posibles
//respuestas numeradas. 
//Si el número introducido por el usuario no está entre uno y cuatro, se le volverá a repetir la pregunta
//hasta que lo esté. Finalmente se le dirá si ha acertado o fallado:

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cómo se escribe 30 en hexadecimal?");
		System.out.println("\t1) 1E");
		System.out.println("\t2) 2F");
		System.out.println("\t3) 33");
		System.out.println("\t4) Ninguno de los anteriores");

		int respuesta = sc.nextInt();

		switch (respuesta) {
		case 2:
			System.out.println("Correcto");
			break;
			
		case 1:
		case 3:
		case 4:
			System.out.println("Error");
			break;
		}

		while (1 > respuesta || respuesta > 4) {
			System.out.println("Cómo se escribe 30 en hexadecimal?");
			System.out.println("\t1) 1E");
			System.out.println("\t2) 2F");
			System.out.println("\t3) 33");
			System.out.println("\t4) Ninguno de los anteriores");

			respuesta = sc.nextInt();
			
			switch (respuesta) {
			case 2:
				System.out.println("Correcto");
				break;
				
			case 1:
			case 3:
			case 4:
				System.out.println("Error");
				break;
			}
		}
		sc.close();

	}

}