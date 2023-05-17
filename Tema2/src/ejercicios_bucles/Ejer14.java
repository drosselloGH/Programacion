//4.- Trivial. Escribe una aplicación que haga una pregunta y muestre un menú con cuatro posibles
//respuestas numeradas Si el número introducido por el usuario no está entre uno y cuatro, se le volverá a repetir la pregunta
//hasta que lo esté. Finalmente se le dirá si ha acertado o fallado.

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		
		do {
			System.out.println("Quién es el autor de la novela 'Ready Player One'?");
			System.out.println("1) Douglas Capland");
			System.out.println("2) Isaac Asimov");
			System.out.println("3) Ernest Cline");
			System.out.println("4) Ray Bradbury");
			num = sc.nextInt();

		} while (num < 1 || num > 4);

		if (num == 3) {
			System.out.println("Correcto");
		} else {
			System.out.println("Error");
		}
	}

}
