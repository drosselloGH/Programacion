//15.- Crea una aplicación que calcule una lista con las potencias de 3 menores que 12000. Haz que
//en cada pasada del bucle se muestre el exponente y el valor de la potencia. Utiliza un bucle do-
//while.

package ejercicios_bucles;

public class Ejer15 {

	public static void main(String[] args) {

		int exponente = 1;
		double potencia = 3;
		do {
			System.out.println("3^ " + exponente + " = " + potencia);
			exponente++;
			potencia = Math.pow(3, exponente);
			

		} while (potencia < 12000);

	}

}