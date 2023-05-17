import java.util.Random;
import java.util.Scanner;

public class ahorcado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String diccionari[] = { "Teclado", "Monitor", "Java" };

		Random r = new Random();
		System.out.println(diccionari.length);

		int e = r.nextInt(diccionari.length);

		String palabra = diccionari[e];
		int vidas = palabra.length(); // Vidas segun el numero de letras de la palabra
		
		while(vidas >= 0 ) {
			
		}

		for (int i = 0; i <= vidas; i++) {
			System.out.println("Escribe una letra");
			char letra = sc.next().charAt(0);
		}

		System.out.println(palabra);
		System.out.println(palabra.length());

//
//		System.out.println("============= AHORCADO =========");
//		System.out.println(paraula[e]);

//		for (int i = 0; i < palabra.length; i++) {
//			char letra = palabra.charAt(i);
//		}

//		System.out.println(palabra.length);

//		int intentosRestantes = 0;
	}
}
