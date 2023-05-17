import java.util.Scanner;

//preguntar numeros hasta que el usuario acierte

public class Ejemplo08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int NUMERO_SECRETO = 7;
		
		System.out.println("Acierte el número y gane");
		int num;
		
		do{
			System.out.println("Numero? ");
			num = sc.nextInt();
			
		} while (num != NUMERO_SECRETO);
		
		System.out.println("Has acertado");

	}

}
