//leer palabras hasta que se escriba "parar"
//usar while y variable semaforo

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palabra;
		
		boolean bucle = true;
		
		while(bucle) {
			System.out.println("Escribe una palabra");
			palabra = sc.nextLine();
			
			if(palabra.equals("parar")) {
				bucle = false;
			} else {
				bucle = true;
			}
		}
		
		System.out.println("FIN");
		
		

	}

}
