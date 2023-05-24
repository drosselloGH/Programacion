package ejercicios;

public class Ejer04 {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 5;
		
		System.out.println(division(num1, num2));
	}
	
	private static int division(int num1, int num2) {		
		//casos base
		if(num1 < num2) {
			return 0; 
		} else if(num1 ==  num2) {
			return 1;
		}
		
		//caso recursivo
//		System.out.println(resultado);
		return 1 + division(num1 - num2, num2);
	
	}
	
}
