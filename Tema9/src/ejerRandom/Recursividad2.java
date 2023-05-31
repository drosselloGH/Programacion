package ejerRandom;

public class Recursividad2 {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(transforma(num));
	}
	
	private static String transforma(int num) {
		String binario = "";
		
		while(num > 0) {
			int resto = num % 2;
			binario = resto + binario;
			
			num = num / 2;
		}
		
		
		return binario;
	}
	
}
