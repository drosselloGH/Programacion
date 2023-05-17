package ejemplo04Interfaces;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un dia de la semana");
		int dia = sc.nextInt();
		
		//usando la interfaz Dias, hace que sea mas inteligible
		switch (dia) {
		case Dias.LUNES:
			System.out.println("Lunes");
			break;
		case Dias.MARTES:
			System.out.println("Martes");
			break;
		case Dias.MIERCOLES:
			System.out.println("Miércoles");
			break;
		case Dias.JUEVES:
			System.out.println("Jueves");
			break;
		case Dias.VIERNES:
			System.out.println("Viernes");
			break;
		case Dias.SABADO:
			System.out.println("Sábado");
			break;
		case Dias.DOMINGO:
			System.out.println("Domingo");
			break;
		}

	}

}
