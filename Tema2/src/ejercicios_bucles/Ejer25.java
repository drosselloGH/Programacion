//25.- Concurso. El programa preguntará continuamente el número secreto (que es 6, evidentemente).
//En el momento en que el usuario acierte, se escribirá el mensaje "Felicidades" y terminará el
//programa. Si el usuario agota sus 10 posibilidades, el mensaje que verá es "Has perdido".
//Utiliza la instrucción break

package ejercicios_bucles;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int NUMERO_SECRETO = 6;
		int num;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Escribe el numero secreto");
			num = sc.nextInt();
			
			if (num == NUMERO_SECRETO) {
				System.out.println("Felicidades");
				break;
			}
		}
		
	}

}