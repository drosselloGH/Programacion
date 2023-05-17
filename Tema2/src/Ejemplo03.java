import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// pedimos dos operandos
		System.out.println("Introduce dos numeros");

		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();

		// 1 -> sumar
		// 2 -> restar
		// 3 -> multilpicar
		// 4 -> dividir

		System.out.println("Que operacion quieres hacer?");
		int operacion = sc.nextInt();

		switch (operacion) {
		case 1:
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case 4:
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		default:
			System.out.println("Gracias por participar");
		}

	}

}
