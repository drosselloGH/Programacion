package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe la contraseña: ");
		int contrasenya = sc.nextInt();

		if (contrasenya == 1234) {
			
			System.out.println("Acceso concedido");
			
		} else {
			
			System.out.println("Acceso denegado");
			while (contrasenya != 1234) {
				
				System.out.println("Escribe la contraseña: ");
				contrasenya = sc.nextInt();

				if (contrasenya == 1234) {
					
					System.out.println("Acceso concedido");
					
				} else {
					
					System.out.println("Acceso denegado");
				}
			}

		}
		sc.close();
		
		//para ver si String es igual a un valor, no podemos usar
		//"==", hay que usar "equals.()

	}

}