//Crea una aplicación que vaya leyendo y guardando en un array las estaturas de 10 personas. A
//continuación, recorrerá el array y nos informará de si alguna de estas estaturas es mayor de 1'90 m

package hoja2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean estaturaEncontrada = false;
		
		double estaturas[] = new double[3];

		for(int i = 0; i <estaturas.length; i++) {
			System.out.print("Escribe una altura: ");
			estaturas[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < estaturas.length; i++) {
			if(estaturas[i] > 1.90) {
				estaturaEncontrada = true;
				break;
			}
		}
		if(estaturaEncontrada) {
			System.out.printf("Hay una estatura que es mayor que 1.90\n");
		} else {
			System.out.println("No hay nadie con estatura superior a 1.90");
		}

	}

}
