package cadenas;

import java.util.Scanner;

public class Cadenas3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palabra1 = "Roma", palabra2 = "Florencia";
		System.out.println(palabra1.compareTo(palabra1));

		// pregntar dos palabras, decir si estan en orden alfabetico o no

		System.out.println("Escriba una palabra");
		String palabra3 = sc.nextLine();
		
		System.out.println("Escriba otra palabra");
		String palabra4 = sc.nextLine();
		
		//comparamos las palabras en mayusculas
		int posicion = palabra3.toUpperCase().compareTo(palabra4.toUpperCase());
		System.out.println(posicion);
		
		if(posicion < 0) {
			System.out.println("Ordenadas");
		} else if(posicion == 0) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No estan ordenadas");
		}

	}

}
