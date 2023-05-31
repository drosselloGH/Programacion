package ejerRandom;

public class Recursividad1 {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(transforma(num));
		
	}
	
	private static String transforma(int n) {
		//caso base
		if(n == 1) {
			return "1";
		} else if(n == 0) {
			return "0";
		}
		
		//caso recursivo
		return transforma(n/2) + n%2;
	}
	
}
