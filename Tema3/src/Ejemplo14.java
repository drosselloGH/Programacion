import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos jugadores hay?");
		int cantJugadores = sc.nextInt();

		int jugadoresRandom[] = new int[cantJugadores];

		for (int i = 0; i < jugadoresRandom.length; i++) {
			jugadoresRandom[i] = i + 1;
		}

		System.out.println("Tabla inicial:");
		System.out.println(Arrays.toString(jugadoresRandom));

		int aux;

		for (int i = 0; i <= 200; i++) {

			int pos1 = (int) (Math.random() * jugadoresRandom.length);

			int pos2 = (int) (Math.random() * jugadoresRandom.length);

			aux = jugadoresRandom[pos1];
			jugadoresRandom[pos1] = jugadoresRandom[pos2];
			jugadoresRandom[pos2] = aux;

		}
		System.out.println("Tabla final:");
		System.out.println(Arrays.toString(jugadoresRandom));

	}
}