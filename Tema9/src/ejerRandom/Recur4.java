package ejerRandom;

public class Recur4 {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 6;
		
		System.out.println(calcular(num1, num2));
		
	}
	
	private static int calcular(int num1, int num2) {
		
		//caso base
		if(num1 == num2) {
			return 1;
		} else if(num2 > num1) {
			return 0;
		}
		
		//caso recursivo
		return 1 + (calcular((num1 - num2), num2));
		
	}
	
}
