import java.util.Scanner;

//ejemplo uso break

public class Ejemplo14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String letra = "a";

		while (true) {

			System.out.println("Escribe una letra:");
			letra = sc.nextLine();

			if(letra.equals("0")) {
				break;
			}
			
			System.out.println("Tu letra es: " + letra + "\n");
			
			
			
		}

	}

}
