//Programa que lee una frase y nos dice por cuántas palabras está formada. Usa el
//método indexOf(int caracter, int posicion)

package cadenas;

import java.util.Scanner;

import javax.swing.text.Position;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una frase");
		String frase = sc.nextLine();

		//puedo ir recorriendo la frase, buscando la posicion del espacio,
		//una vez encontrado un espacio, buscamos otro a partir de la poscion
		//del anterior espacio		
		
		//por que "cantPalabras = 0" no funciona??
		//asumimos que hay una palabra
		int cantPalabras = 1;
		
		System.out.println(frase);
		
		//buscamos el primer espacio		
		int posEsp = frase.indexOf(' ', 0);
		//mostramos la posicion del 1r espacio
//		System.out.println(posEsp);
		
		//si hay un espacio, cuenta +1 palabra
		if(posEsp != -1) {
			cantPalabras++;
		}
		
		//mientras la posicion del espacio sea menor o igual a la longitud de la cadena
		while(posEsp <= frase.length()) {
			//la el espaio siguiente se buscará a partir de la anterior posición del espacio
			int posSiguiente = frase.indexOf(' ', posEsp +1);
			//y la posición del espacio tendrá el valor de la siguiente posición del espacio
			//y así, sucesivamente
			posEsp = posSiguiente;
			//mostramos la posición del siguiente espacio
//			System.out.println(posSiguiente);
			//si hay otro espacio, sumamos +1 a palabras
			if(posSiguiente != -1) {
				cantPalabras++;
				//si no hay espacio, acaba el bucle
			} else {
				break;
			}
		}
		
		System.out.println("La frase tiene "+cantPalabras+" palabras");

	}

}
