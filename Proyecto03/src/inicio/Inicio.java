package inicio;

import java.util.Scanner;

import biblioteca.Autor;

public class Inicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*probar los metodos
		 * seters
		 * geters
		 * */
		
		System.out.println("Datos autor");
		System.out.println("Nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Fecha nacimiento: ");
		int fechaNacimiento = sc.nextInt();
		
		Autor aut = new Autor(nombre, email, fechaNacimiento);
		
		System.out.println(aut.toString());

	}

}
