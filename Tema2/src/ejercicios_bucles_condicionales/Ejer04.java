//4.- Modifica el programa anterior para que después de decir el resultado te haga la siguiente
//pregunta:
//¿Quieres continuar (s/n)?
//Si la respuesta es 's', volverá a empezar el bucle. Si la respuesta es cualquier otra, acabará el
//programa, con un mensaje de despedida

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, suma;
		boolean continuar = true;

		while (continuar) {

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

			System.out.println("Quieres continuar? (s/n)");
			
			//con esto leeremos el primer caracter de una string
			char letra = sc.next().charAt(0);;
			
			if(letra == 's') {
				continuar = true;
			} else if (letra == 'n') {
				continuar = false;
				System.out.println("Nos vemos");
			}
			
//			hay que poner un sc.nextLine() para limpiar el buffer del teclado
//			sc.nextLine();
//			System.out.println("Quieres continuar? (s/n)");
//			String letra = sc.nextLine();
//			if(letra.equals("s")) {
//				continuar = true;
//			} else if (letra.equals("n")) {
//				continuar = false;
//				System.out.println("Nos vemos");
//			}

		}
		

	}

}
