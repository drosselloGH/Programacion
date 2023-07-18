import java.util.Scanner;

/**
 * 
 * Este programa indica cuales son los numeros primos que componen un número
 * 
 * @author danie
 *
 */
public class DescomponerEnNumerosPrimos {

	/**
	 * 
	 * Programa principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		mostrarPanel();

		int num = sc.nextInt();

		System.out.println(descomponer(num));

	}

	/**
	 * Muestra un panel
	 */
	public static void mostrarPanel() {
		System.out.println("************************");
		System.out.println("** DESCOMPONER NUMERO **");
		System.out.println("************************");

		System.out.print("Número: ");
	}

	/**
	 * 
	 * @param num
	 * @return cadena de numeros
	 */
	public static String descomponer(int num) {

		String numeros = "";

		/*Forma más larga */
		
//		while (num != 1) {
//			if (num % 2 == 0) {
//				System.out.println(num);
//				numeros = numeros + " " + 2;
//				num = num / 2;
//			} else if (num % 3 == 0) {
//				System.out.println(num);
//				numeros = numeros + " " + 3;
//				num = num / 3;
//			} else if (num % 5 == 0) {
//				System.out.println(num);
//				numeros = numeros + " " + 5;
//				num = num / 5;
//			} else if (num % 7 == 0) {
//				System.out.println(num);
//				numeros = numeros + " " + 7;
//				num = num / 7;
//			} else if(num % 11 == 0) {
//				System.out.println(num);
//				numeros = numeros + " " + 11;
//				num = num / 11;
//			}
//		}

		/*Forma más corta (no funciona del todo bien)*/
		
		int numPrimos[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		for (int primos : numPrimos) {
			if (num % primos == 0) {
				numeros = numeros + " " + primos;
				num = num / primos;
			}
			
		}

		return numeros;
	}

}
