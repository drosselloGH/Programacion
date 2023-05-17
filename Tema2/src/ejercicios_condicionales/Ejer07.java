package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int secreto = (int)(Math.random()*10+1); //creamos un numero aleatorio
		System.out.println(secreto);
		
		System.out.println("Adivina el número secreto");
		int numero = sc.nextInt();
	
		if (numero == secreto) {
			System.out.println("Bien hecho, has acertado! ");
			
		} else {
			//si el numero no es correcto, envia este mensaje y se crea un bucle
			System.out.println("Erróneo\n");
			
			while (numero != secreto) { //mientras el numero no sea el correcto...
				
				System.out.println("Adivina el número secreto"); //vuelve a hacer la pregunta
				numero = sc.nextInt();
				
				if (numero == secreto) { //si el numero es correcto, acaba el bucle
					System.out.println("Bien hecho, has acertado");
					
				} else { //si el numero sigue siendo erróneo, se repite el bucle
					System.out.println("Erróneo\n");
					
				}
				
			}
		}
		
	}

}