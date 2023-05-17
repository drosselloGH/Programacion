package clase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número: ");
		int dividendo = sc.nextInt();
		System.out.println("Escribe otro número: ");
		int divisor = sc.nextInt();
		
		Utilidades util = new Utilidades();
		System.out.println("Resultado de "+dividendo+" / "+ divisor+": "+util.division(dividendo, divisor));
		
		System.out.println("\nEscribe una cadena de texto con números");
		String cadena = sc.nextLine();
		
		System.out.println(util.extraerNumero(cadena));

	}

}
