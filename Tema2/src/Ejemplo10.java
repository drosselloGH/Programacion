import java.util.Scanner;

//pedir al usuario que vaya escribiendo numeros enteros
//si el numero es divisible entre 3 y entre 5, se le seguira pidiendo mas numeros
//cuando se escriba un numero que no cumpla esa condicion, acaba el programa
public class Ejemplo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//le damos un valor cualquiera a num para que el programa no nos de
		//un error en el print final

		int numero;
		//mientras sea true, se ejecuta el bucle, cuando sea false, no
		boolean numCorrecto = true;
		do {

			System.out.print("Escribe un número: ");
			numero = sc.nextInt();
			
			if(numero % 15 != 0) {
				numCorrecto = false;
				System.out.println("No es multiplo de 3 y 5");
			}

		} while (numCorrecto = true);

		System.out.println("No es multiplo de 3 y 5");
//		if (numero % 15 != 0) {
//			System.out.println("No es múltiplo de 3 y 5");
//		}

	}

}
