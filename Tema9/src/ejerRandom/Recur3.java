package ejerRandom;

public class Recur3 {

	public static void main(String[] args) {
		
		int num = 3;
		
		System.out.println(aHex(num));
		
	}
	
	private static String aHex(int n) {
		
		//caso base
		if(n == 0) {
			return "";
		} else if (n <= 9) {
			return ""+n;
		}
		
		int resto = n % 16;
		
		char letra = caracter(resto);
		
		return aHex(n / 16) + letra;
		
	}
	
	private static char caracter (int resto) {
		
		char[] letras = {'A', 'B', 'C','D', 'E', 'F'};
		
		return letras[resto - 10];
		
	}
	
}
