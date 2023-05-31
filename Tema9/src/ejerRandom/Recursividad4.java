package ejerRandom;

public class Recursividad4 {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 6;
		
		System.out.println(calcularDivision(num1, num2));
		
	}
	
	private static int calcularDivision(int num1, int num2) {
		
		if(num1 < num2) {
			return 0;
		} else if(num1 == num2) {
			return 1;
		}
		
		return 1 + calcularDivision((num1-num2), num2);
	}
	
}
