package Tema6;

import java.util.Scanner;

/**
 * Dialecto JAVA 1: "Javalín, javalón "+ mensaje 
 * Dialecto JAVA 2: mensaje+ "javalén, len, len"
 * 
 * decir si la frase introducida esta en idioma Javalandia, si lo esta, mostrar
 * el mensaje sin muletillas
 * 
 */

public class Ejer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un mensaje");
		String mensaje = sc.nextLine();
		
		comprobarLenguaje(mensaje);

	}
	
	private static void comprobarLenguaje(String frase) {
		
		String prefijo = "Javalín, javalón";
		String sufijo = "javalén, len, len";
		
		if(frase.contains(prefijo) || frase.contains(sufijo)) {
			System.out.println("Está en un dialecto de Java");
			
			System.out.print("Traducción de la frase: \n"+traducir(frase, prefijo, sufijo));
			
		} else {
			System.out.println("Esta escrito en un idioma normal");
		}
	}
	
	private static String traducir(String frase, String prefijo, String sufijo) {
		
		if(frase.startsWith(prefijo)) {
			//copiamos la frase a partir del finl del prefijo
			frase = frase.substring(prefijo.length());
			
		} else if(frase.endsWith(sufijo)) {
			//copiamos la frase desde el fin hasta la posicion del sufijo
			frase = frase.substring(0, frase.length() - sufijo.length());
		}
		
		//quitamos los espacios en blanco
		frase = frase.strip();
		
		return frase;
		
	}

}
