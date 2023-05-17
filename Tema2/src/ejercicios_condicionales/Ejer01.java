package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce temperatura del reactor nuclear: ");
		float temperatura = sc.nextFloat();

		if (temperatura > 120) {
			System.out.println("TEMPERATURA DEL REACTOR CRÍTICA. \n ¡CORRED, INSENSATOS!");
		}
		sc.close();
	}

}
