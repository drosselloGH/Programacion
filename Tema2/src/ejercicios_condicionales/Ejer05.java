package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe el número de un mes: ");
		int mes = sc.nextInt();

		if (mes >= 1 && mes <= 12) {
			System.out.println("Mes correcto");
		} else {
			System.out.println("Mes incorrecto");
		}

	}

}
