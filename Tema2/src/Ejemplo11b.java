//.- Escribe una aplicación que pregunte al usuario un número entre 1 y 5. Si responde "3", se le
//felicitará por haber acertado. Si no, se le seguirá pidiendo más números.

import java.util.Scanner;

public class Ejemplo11b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero (entre 1 y 5)");
		int num = sc.nextInt();

		boolean acierto = false;
		
		//!acierto es igual que acierto == false
		while (!acierto) {
			System.out.println("Escribe un numero (entre 1 y 5)");
			num = sc.nextInt();
			
			if (num == 3) {
				acierto = true;
			} else if(num != 3) {
				acierto= false;
			}
		}

		System.out.println("Enhorabuena, has acertado");

		sc.close();
	}

}
