package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String CLAVE_CORRECTA = "java8";
		final String USUARIO_CORRECTO = "usuario";

		System.out.println("Escribe el nombre de usuario: ");
		String usuario = sc.next();
		usuario = usuario.toLowerCase();

		System.out.println("Escribe clave de acceso: ");
		String contrasenya = sc.next();
		contrasenya = contrasenya.toLowerCase();
		
		if (usuario.equals(USUARIO_CORRECTO) && contrasenya.equals(CLAVE_CORRECTA)) {
			System.out.println("Acceso concedido");
		} else {
			System.out.println("Acceso denegado");
		}
	}

}