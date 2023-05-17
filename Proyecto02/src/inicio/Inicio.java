package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una distancia en quilometros: ");
		double km = sc.nextDouble();
		System.out.println(Conversor.millas(km) + " millas");

		System.out.println("Escriba una presión en milibares: ");
		double milibares = sc.nextDouble();
		System.out.println(Conversor.atmosferas(milibares) + " atmósferas");

		System.out.println("Escribe una cantidad de energia en calorias: ");
		double calorias = sc.nextDouble();
		System.out.println(Conversor.julios(calorias) + " julios");

	}

}
