//Crea un programa que guarde la siguiente tabla de edades en forma de array. A continuación
//deberá buscar si hay alguna persona con 35 años. Si la hay, se mostrará el mensaje "Localizada
//persona de 35 años". Utiliza una variable semáforo llamada edadEncontrada.

package hoja2;

public class Ejer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edades[] = { 20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19 };

		// buscamos a alguien de 35 años

		int edadBuscar = 35;

		boolean personaEncontrada = false;

		for (int i = 0; i < edades.length; i++) {
			if (edades[i] == edadBuscar) {
				personaEncontrada = true;
				break;
			}
		}
		if (personaEncontrada) {
			System.out.println("Localizada persona de 35 años");
		} else {
			System.out.println("Persona de 35 años no localizada");
		}

	}

}
