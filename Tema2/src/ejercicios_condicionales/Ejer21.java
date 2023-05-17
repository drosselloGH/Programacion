package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Con qué idioma quieres saludar?  \n1 --> Francés \n2 --> Inlgés \n3 --> Alemán\n4 --> Italiano");

		if (sc.hasNextInt()) {
			int operacion = sc.nextInt();

			switch (operacion) {
			case 1:
				System.out.println("Bonjour");
				break;
			case 2:
				System.out.println("Good morning");
				break;
			case 3:
				System.out.println("Guten morgen");
				break;
			case 4:
				System.out.println("Buongiorno");
				break;
			default:
				System.out.println("Buenos días");
			}

		} else {
			System.out.println("NO es entero");
		}

	}

}
