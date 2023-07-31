import java.util.Arrays;
import java.util.Iterator;
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
	 * @param numero
	 * @return cadena de numeros
	 */
	public static String descomponer(int numero) {
		
		String numerosPrimos = "";
		
		if(numero == 1) {
			numerosPrimos += "1";
		}
		
		//empezamos a descomponer por el primer numero primo
		int primo = 2;

		while (numero != 1) {
			//si la division entre el número y el primo es exacta
			while (numero % primo == 0) {
				//el numero primo se añade a la lista
				numerosPrimos = numerosPrimos +primo+ " ";
				//y dividimos el numero por el numero primo
				numero /= primo;
			}
			
			//si no tiene un resto exacto, vamos al siguiente numero 
			//(pues no seria un multiplo del numero)
			primo ++;
		}
		
		return numerosPrimos;
	}
	
	/**
	 * 	cuenta cuantas veces aparece un numero, y lo muestra en forma de potencia
	 */
//	public static void potencias (String cadenaNumeros) {
//		
//		String numeros[] = cadenaNumeros.split(" ");
//		
//		int cantVecesNum = 0;
//		
//		for (int i = 0; i < numeros.length; i++) {
//				cantVecesNum ++;
//		}
//		
//		String cadenaFinal = ""+numeros[0]+"^"+cantVecesNum;
//		
//		System.out.println(cadenaFinal);
//		
//	}
	
}
