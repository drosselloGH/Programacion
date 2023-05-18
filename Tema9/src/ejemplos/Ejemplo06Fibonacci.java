package ejemplos;
public class Ejemplo06Fibonacci {
	public static void main(String[] args) {
		int num = 4;
		
		System.out.println("El termino de la sucesion de Fibonacci con la posicion "+num+ " es: "+fibonacci(num));
		
		
	}
	
	private static int fibonacci(int n) {
		
		System.out.println("Calculando Fibonacci de "+n);
		
		//caso base
		if(n == 0 || n == 1) {
			return 1;			
		}
		
		//caso recursivo
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
}
