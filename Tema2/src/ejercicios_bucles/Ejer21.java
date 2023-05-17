//21.- Utiliza un bucle for para preguntar 5 veces por un número entero, y al final devolver la frase
//"Has fallado".

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Escribe un número");
			int num = sc.nextInt();
			
		}
		
		System.out.println("Has fallado");
		

	}

}
