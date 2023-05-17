package ejemplo05Excepciones;

import java.util.Scanner;

public class Division2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String respuesta = entrada.nextLine();
		
		try {
			int num = Integer.parseInt(respuesta);
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);
			//indicamos el tipo de error que traera. y el nombre de una variable
			//representando el error
		} catch(NumberFormatException e) {
			//esto se ejecuta si se produce un error
			System.out.println("Eres tonto o que");
			//se puedem poner tantos "catch" como queramos
		} catch(ArithmeticException e) {
			System.out.println("0 no sirve, inutil");
			//un error cualquiera
		} catch(Exception e) {
			System.out.println("Error inesperado, imbecil");
		}
		
		
	}

}
