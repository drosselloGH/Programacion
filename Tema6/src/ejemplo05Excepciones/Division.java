package ejemplo05Excepciones;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String respuesta = entrada.nextLine();

		try {
			int num = Integer.parseInt(respuesta);
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);
			// indicamos el tipo de error que traera. y el nombre de una variable
			// representando el error
		} catch (Exception e) {
			System.out.println("Error inesperado, imbecil");
			//por que se ha producido el error
//			System.out.println(e.getMessage());
			e.printStackTrace();
			//indica el tipo de error que ha habido y el por que del error
//			System.out.println(e.toString());
		}
		System.out.println("n");

	}

}
