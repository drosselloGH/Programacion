//3.- Crea una aplicación para probar la capacidad de cálculo mental de los usuarios. Se calcularán
//dos números aleatorios entre 1 y 100 y se mostrarán en pantalla. A continuación el usuario deberá
//escribir el resultado de la suma de ambos números y se le indicará si ha acertado o no.
//Estas acciones se repetirán indefinidamente mediante un bucle while

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, suma;

		while (true) {

			num1 = (int) (Math.random() * 100 + 1);
			num2 = (int) (Math.random() * 100 + 1);

			System.out.println("El numero 1 es: " + num1);
			System.out.println("El numero 2 es: " + num2);

			System.out.println("La suma de ambos numeros es: ");
			suma = sc.nextInt();

			if (suma == (num1 + num2)) {
				System.out.println("Correcto\n");
			} else {
				System.out.println("Has fallado. La respuesta era: " + (num1 + num2) + "\n");
			}

		}

	}

}
