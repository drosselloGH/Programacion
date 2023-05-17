import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		System.out.print("Escribe un numero: ");
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();

		System.out.print("Escribe otro numero: ");
		float num2 = sc.nextFloat();

		// mostramos el cociente de los dos numeros
		System.out.println("Cociente: " + num1 / num2);

		// mostramos el resto de los dos numeros
		System.out.print("Resto: " + num1 % num2);

	}

}
