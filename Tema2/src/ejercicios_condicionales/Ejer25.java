/*25.- Crea un programa que pregunte el nombre del usuario y luego lo escriba.
 *  Ahora bien, si el usuario no introduce nada, 
 *  el nombre deberá quedar con el valor "Desconocido".*/

package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre");
		String nombre = sc.nextLine();
		
		 String vacio = nombre.equals("") ? "Nombre: Desconocido" : ("Nombre: " + nombre.toUpperCase());
		 System.out.println(vacio);
		 
	}

}