package clase;

import java.util.Scanner;

public class Main1 {

	
	
//	public static String extraerNumero(String cadena) {
//		// creamos una cadena de caracteres igual a la cadena original
//		char[] cadena_div = cadena.toCharArray();
//		// creamos una cadena vacía
//		String n = "";
//		// recorremos la cadena de caracteres
//		for (int i = 0; i < cadena_div.length; i++) {
//			// si el caracter es un dígito
//			if (Character.isDigit(cadena_div[i])) {
//				// lo añadimos a la cadena vacía
//				n += cadena_div[i];
//				while(Character.isDigit(cadena_div[i])) {
//					n+= cadena_div[i];
//				}
//				
//			}
//		}
//		// int numero = Integer.parseInt(n);
//		return n;
//	}
	public static String extraerNumero(String cadena) {
		char[] cadena_div = cadena.toCharArray();
		String n = "";
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isDigit(cadena_div[i])) {
				n += cadena_div[i];
				for (int j = i + 1; j < cadena.length(); j++) {
					if (Character.isDigit(cadena_div[j])) {
						n += cadena_div[j];
					}
					break;
				}
				break;
			}
		}
		return n;
	}

}
