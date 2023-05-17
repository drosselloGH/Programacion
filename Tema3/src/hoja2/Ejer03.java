//Escribe un programa que lea una lista de nombres (uno a uno, hasta un máximo de 10) por
//consola y los vaya guardando en un array llamado nombres. La aplicación terminará de pedir
//palabras cuando el usuario escriba "nadie".


package hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombres[] = new String[10];
		
		//esta variable servira para saber si es correcto o no el nombre
		String nombre;
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.println("Escribe un nombre");
			nombre = sc.nextLine();
			
			//la hacemos mayuscula
			nombre = nombre.toUpperCase();
			
			if(nombre.equals("NADIE")){
				break;
			} else {
				//si no es "nadie", es el valor de nombres[i]
				nombres[i] = nombre;
			}
		}
		
		//A continuación revisará el array y averiguará si se ha introducido el nombre "Calderón". Si es así
		//escribirá "de la Barca". Si no, escribirá "Nombre no encontrado". Utiliza una variable semáforo
		//llamándola nombreEncontrado.
		
		boolean nombreEncontrado = false;
		
		for(String persona : nombres) {
			if(persona != null && persona.toUpperCase().equals("CALDERON")) {
				nombreEncontrado= true;
				break;
			} else {
				nombreEncontrado = false;
			}
		}
		
		if(nombreEncontrado) {
			System.out.println("De la Barca");
		} else {
			System.out.println("Nombre no encontrado");
		}

	}

}
