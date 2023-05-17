//La siguiente tabla guarda el número de espectadores que vieron La 2 a las 23:00 horas, cada día
//de la semana. Escribe un programa que busque el máximo y el mínimo de audiencia en esta semana

package hoja2;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int espectadores[] = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };

		// hacemos un array con los dias de la semana
		String diaSemana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

		// indice del dia con menos espectadores
		int posMin = 0, posMax = 0;

		for (int i = 0; i < espectadores.length; i++) {
			if (espectadores[i] > espectadores[posMax]) {
				posMax = i;
			}
			if (espectadores[i] < espectadores[posMin]) {
				posMin = i;
			}
		}

		// usamos el maximo y el minimo como indices de los dias de la semana
		System.out.println("El dia con menos audiencia ha sido el " + diaSemana[posMin] + " con " + espectadores[posMin]
				+ " espectadores");
		System.out.println("El dia con más audiencia ha sido el " + diaSemana[posMax] + " con " + espectadores[posMax]
				+ " espectadores");

	}

}
