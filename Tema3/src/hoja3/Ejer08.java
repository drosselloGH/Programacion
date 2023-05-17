//Juego de Piedra, papel o tijera. Escribe un programa que dé al
//usuario la opción de elegir entre las siguientes opciones:
//1) Piedra
//2) Papel
//3) Tijera
//Una vez el usuario ha elegido, escribiendo el número de opción, el programa obtendrá un número al
//azar entre 1 y 3 y resolverá quién ha ganado siguiendo las típicas reglas:
//• La piedra aplasta la tijera (gana la piedra).
//• La tijera corta el papel (gana la tijera).
//• El papel envuelve la piedra (gana el papel).

package hoja3;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Piedra, Papel o Tijera");
			System.out.println("=======================");

			System.out.println("Elige: ");
			System.out.println("1) Piedra");
			System.out.println("2) Papel");
			System.out.println("3) Tijera");

			int jugador = sc.nextInt();

			int ia = (int) (Math.random() * 3 + 1);

			switch (ia) {
			case 1:
				System.out.println("La IA saca... Piedra");
				break;

			case 2:
				System.out.println("La IA saca... Papel");
				break;
			case 3:
				System.out.println("La IA saca... Tijeras");
				break;
			}

			if (ia == 2 && jugador == 1 || (ia == 1 && jugador == 3) || (ia == 3 && jugador == 2)) {
				System.out.println("La IA ha ganado");
			} else if (ia == jugador) {
				System.out.println("¡Ha habido empate!");
			} else {
				System.out.println("Has ganado");
			}
			System.out.println();
		}

	}

}
