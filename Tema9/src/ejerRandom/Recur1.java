package ejerRandom;

public class Recur1 {

	public static void main(String[] args) {
		
		int num = 23;
		System.out.println(aBinario(num));
		
	}
	
	private static String aBinario(int n) {
		
		//caso base
		if(n == 0) {
			return "0";
		} else if(n == 1) {
			return "1";
		}
		
		//caso recursivo
		return aBinario(n /2) + n % 2;
		
		
	}
	
}
