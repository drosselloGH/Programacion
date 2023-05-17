/*27.- Queremos diseñar un programa que solicite un número al usuario y le responda "Es impar" o
"No es impar". Utiliza para ello la notación ? en lugar de if asignando a una variable de tipo String
el resultado y mostrando después esta variable. Y verificar que sea un numero correcto*/

package ejercicios_condicionales;

import java.util.Scanner;

public class Ejer27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero");

		if (sc.hasNextLong() == true) { //leemos la entrada, y si es verdad...
			long num = sc.nextLong();
			String result = (num % 2 == 0) ? "No es impar" : "Es impar";
			System.out.println(result);
			
		} else {
			System.out.println("Tiene que ser un número");
		}

	}

}