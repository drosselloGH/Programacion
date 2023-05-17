//1.- Escribe un programa que invente un nº aleatorio entre 1 y 10. El usuario tendrá que adivinarlo en
//tres intentos como máximo. Al finalizar el programa se le dirá si ha acertado el número y en cuántos
//intentos lo ha hecho. Utiliza while y break.

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer01b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroAleatorio = (int) (Math.random() * 10 + 1);
		System.out.println(numeroAleatorio);

		int fallos = 0; // cantidad de fallos que ha hecho el usuario

		System.out.println("Adivina el numero secreto:");
		int respuesta = sc.nextInt();

		if (respuesta == numeroAleatorio) {
			System.out.println("Correcto");
			System.out.println("Cantidad de intentos: " + fallos);

		} else {
			fallos++;
			System.out.println("Error\n");
			while (fallos < 4) {
				
				System.out.println("Adivina el numero secreto:");
				respuesta = sc.nextInt();

				if (respuesta == numeroAleatorio) {
					System.out.println("Correcto");
					System.out.println("Cantidad de fallos: " + fallos);
					break;

				} else {
					fallos++;
					System.out.println("Error");
				}

				if (fallos == 3) {
					System.out.println("Has cometido " + fallos + " fallos");
					break;
				}

			}
		}

	}

}