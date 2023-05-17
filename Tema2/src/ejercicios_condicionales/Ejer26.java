/*26.- Crea un programa que calcule la hora de cierre de una tienda. Esta hora depende del valor de
una variable de tipo String llamada dia. Si su valor es "entre semana", la hora de cierre de la tienda
será "20:00". En otro caso, la hora de cierre será "14:00".*/

package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el día: (entre semana o nada");
		String dia = sc.nextLine();

		dia = dia.toUpperCase();
		//convertimos la String a mayusculas

		String cierre = (dia.equals("ENTRE SEMANA")) ? "20:00" : "14:00";
		//si el dia es igual a "ENTRE SEMANA", será true, sino, será false
		
		System.out.println("Horario de cierre: "+ cierre);
			
		}

	}


