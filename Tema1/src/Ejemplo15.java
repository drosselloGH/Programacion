//importamos la utilidad Scanner de Java
import java.util.Scanner;

public class Ejemplo15 {

	public static void main(String[] args) {

		//creamos el scanner
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Como te llamas? ");
		//pedimos un nombre
		String nombre = entrada.nextLine();

		System.out.println("Un gusto conocerte, "+nombre);
		
		//cuantos años tienes?		
		System.out.println("Cuantos años tienes? ");
		byte edad = entrada.nextByte();
		
		//no parece que tengas x años		
		System.out.println("No parece que tengas " + edad + " años");



		
	}

}
