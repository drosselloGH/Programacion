package ejerRandom;

public class Recursividad5 {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(sumaTotal(n));
	}
	
	public static int sumaTotal(int n) {
		
		//caso base
		if(n == 1) {
			return 1;
		}
		
		return n + sumaTotal(n-1);
	}
	
}
