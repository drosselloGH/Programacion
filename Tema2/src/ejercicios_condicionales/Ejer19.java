package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el numero de un mes");
		int mes = sc.nextInt();

		System.out.println("Escribe el número de este año");
		int anyo = sc.nextInt();
		
		
			switch (mes) {
			case 2:
				if (anyo%4 == 0 && ((anyo % 100 != 0) ||(anyo % 400 == 0))){
					System.out.println("Es bisiesto, 29 dias");
				} else {
					System.out.println("No es bisiesto, 28 dias");
				}
				break;

			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
			case 11:
				System.out.println("30 días");
				break;

			case 4:
			case 6:
			case 8:
			case 10:
			case 12:
				System.out.println("31 días");
				break;

			default:
				System.out.println("Ese mes no existe");
			}
		}

	}


