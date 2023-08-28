package Tema6;

import java.util.Arrays;

public class Teoria {

	public static void main(String[] args) {
		
		String cadena = "Hola amigos";
		String cadena2 = "hola AmigOs";
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.equals(cadena2));
		
		
		//no distingue entre mayusculas y no-mayusculas
		System.out.println(cadena.equalsIgnoreCase(cadena2));
		
		/*
		 * compara alfabeticamente dos cadenas
		 * 0 --> cadenas alfabeticamente iguales
		 *  <0 --> cadena invocante antes que la pasada como parametro
		 *  >0 --> cadena pasada como parametro va antes que la invocada
		 * */
		System.out.println(cadena.compareTo(cadena2));
		
		/*Mostrar los caracteres de una cadena*/
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		
		//mostrar una parte de la cadena
		/**
		 * inicio
		 * fin (opcional)
		 */
		String subcadena = cadena2.substring(1, 6);
		System.out.println(subcadena);
		
		//elimina espacios en blanco en los extremos de la frase
		String cadena3 = "         Hola amigoooos    ";
		System.out.println(cadena3.strip());
		
		//en que posicion se encuentra algo
		/**
		 * int --> x si se encuentra en la cadena, -1 si no
		 * String --> en que posicion se encuentra una subcadena
		 * int, int (posicion inicio)
		 * String, int (posicion inicio)
		 */
		System.out.println(cadena.indexOf("poscionLetra"));
		
		//busca la letra desde el fin hasta el principio
		/**
		 * Funciona igual que el indexOf()
		 */
		System.out.println(cadena.lastIndexOf("a"));
		
		String vacia = "     ";
		//si la cadena esta vacia ""
		System.out.println(vacia.isEmpty());
		//si la cadena esta llena, pero solo con espacios
		System.out.println(vacia.isBlank());
		
		String frase = "En un lugar de La Mancha";
		String palabra = "lugar";
		
		//indica si una frase contiene una subcadena o no
		System.out.println(frase.contains(palabra));
		
		//indica si una cadena empieza con el contenido pasado como parametro
		/**
		 * String contenido a buscar
		 * int a partir de donde buscar (opcional)
		 */
		System.out.println(frase.startsWith(palabra, 2));
		//indica si una cadena acaba con el contenido pasado como parametro
		System.out.println(frase.endsWith("cha"));
		
		//separa una cadena por el caracter pasado como parametro
		String quitarT[] = cadena.split("t");
		
		String cadena4 = "hola amigos como ehtan";
		
		//cambia el caracter de una cadena por otro
		cadena4 = cadena4.replace("o", "4");
		System.out.println(cadena4);
		
		//convierte una cadena de caracteres en un array de letras	
		char[] letras = cadena4.toCharArray();
		System.out.println(Arrays.toString(letras));
		
		//convierte un array de caracteres a una cadena String
		char[] letras2 = {'h', 'o', 'l', 'a'};
		String cadena5 = String.valueOf(letras2);
		
		System.out.println(cadena5);
		
		//convierte en String un array de caracteres desde la posicion x hasta la y
		String cadena6 = String.valueOf(letras2, 1, 3);
		System.out.println(cadena6);
		
	}
	
}
