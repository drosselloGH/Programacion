//9.- Escribe un programa para monitorizar temperaturas. Se le preguntará al usuario por una
//temperatura (puede tener decimales).
//Si está entre 10 y 30 grados se mostrará el mensaje "Temperatura correcta". Si es mayor de 30 y
//menor o igual a 40, se mostrará el mensaje "Activar ventiladores a media potencia". Si es mayor de
//40 se mostrará el mensaje "Activar ventiladores a máxima potencia".
//El proceso se irá repitiendo mientras la temperatura esté entre unos límites aceptables (entre 0 y
//50ºC).

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float temp = 0;
		
		do {
			System.out.println("Escribe la temperatura de la sala (puede tener decimales)");
			temp = sc.nextFloat();
			if (temp < 10 && temp >= 0) {
				System.out.println("Hace un frío de cojones");
			}else if (temp >= 10 && temp <= 30) {
				System.out.println("Temperatura correcta");
			} else if (temp > 30 && temp <= 40) {
				System.out.println("Activar ventiladores a media potencia");
			} else if (temp > 40) {
				System.out.println("Activar ventiladores a máxima potencia");
			}
		} while (temp > 0 && temp < 50);
		
	}

}
