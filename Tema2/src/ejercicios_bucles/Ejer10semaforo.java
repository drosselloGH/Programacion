//10.- Trivial. Escribe una aplicación que haga una pregunta y muestre un menú 
//con cuatro posibles respuestas numeradas. 
//Si el número introducido por el usuario no está entre 1 y 4, 
//se le volverá a repetir la pregunta hasta que lo esté. 
//Finalmente se le dirá si ha acertado o fallado:

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer10semaforo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int respuesta = 0; //inicializamos la variable en 0

		boolean rangoCorrecto = false; //asumimos que el numero va a estar en
										//un rango incorrecto
		
		while (!rangoCorrecto) {
			System.out.println("Cómo se escribe 30 en hexadecimal?");
			System.out.println("\t1) 1E");
			System.out.println("\t2) 2F");
			System.out.println("\t3) 33");
			System.out.println("\t4) Ninguno de los anteriores");
			
			respuesta = sc.nextInt();
			
			rangoCorrecto = (respuesta < 1 || respuesta > 4) ? false : true;
		}
		
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
}