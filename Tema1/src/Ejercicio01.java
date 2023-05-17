import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		System.out.println("Introduce un numero: ");
		Scanner sc = new Scanner(System.in);

		// pedimos un numeor
		float num1 = sc.nextFloat();

		System.out.println("Introduce otro numero: ");

		float num2 = sc.nextFloat();

		// multiplicamos los dos numeros
		System.out.print(num1 * num2);

	}

}
