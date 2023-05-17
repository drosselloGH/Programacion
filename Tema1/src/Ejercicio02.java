import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		System.out.print("Introduce un numero: ");

		Scanner sc = new Scanner(System.in);

		float num1 = sc.nextFloat();

		System.out.print("Introduce otro numero: ");
		float num2 = sc.nextFloat();

		// calculamos resto de los dos numeros
		System.out.print("El resto de " + num1 + " y " + num2 + " es " + num1 % num2);

	}

}
