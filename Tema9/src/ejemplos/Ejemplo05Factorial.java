package ejemplos;
import javax.xml.parsers.FactoryConfigurationError;
public class Ejemplo05Factorial {
	public static void main(String[] args) {
		
		int num = 5;
		System.out.println("Factorial de "+num+" = "+factorial(num));
		
	}
	
	private static int factorial(int n) {
		
		System.out.println("Calculando el factorial de "+n);
		if(n == 1) {
			return 1;		//caso base
		}
		return n * factorial(n-1);		//caso recursivo
	}
	
}
