import java.util.Scanner;

//pregunta una estatura y dice si eres de estatura baja, media o alta

public class Ejemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Estatura (en metros): ");
		float estatura = sc.nextFloat();

		if (estatura > 1.80) {
			System.out.println("Eres alto");

		} else if (estatura <= 1.80 && estatura >= 1.70) {
			System.out.println("Tienes una altura media");

		} else {
			System.out.println("Eres bajito");

		}
		System.out.println("Gracias por participar");

	}

}
