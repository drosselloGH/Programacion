package ejercicios;
import java.util.Scanner;
public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Escribe un numero decimal y mostramos el numero binario: ");
		int num = sc.nextInt();
		
		System.out.println("El binario de "+num+" es: "+transforma(num));
		
		
	}
	
	private static String transforma(int n) {
		if(n == 1) {
			return "1";
		} else if(n == 0) {
			return "0";
		}
		
		return transforma(n/2) + n%2;
		
	}
	
}
