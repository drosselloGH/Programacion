//.- Modifica el programa anterior para que pida un carácter y también el número de veces que
//queremos repetirlo

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		String frase = sc.nextLine();
		
		System.out.println("Cuantas veces la quieres repetir");
		int repeticiones = sc.nextInt();
		
		int contador = 1;
		
		while (contador <= repeticiones) {
			System.out.println(contador + "( )" + frase);
			contador++;
			
		}
		sc.close();
	}

}
