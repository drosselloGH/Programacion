package ejerRandom;

public class Recur5 {

	public static void main(String[] args) {
		
		int num = 34;
		System.out.println(suma(num));
	}
	
	private static int suma(int num) {
		
		//caso base
		if(num == 1) {
			return 1;
		}
		
		//caso recursivo
		return suma(num -1) + num;
		
	}
	
}
