import java.util.Scanner;

public class Ejemplo17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("edad");
		sc.hasNextInt();

		if (sc.hasNextInt()) {
			int edad = sc.nextInt();
			System.out.println("Tu edad es " + edad);
		} else {
			System.out.println("No has escrito un número válido");
		}

		
		
	}

}
