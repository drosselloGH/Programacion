package ejercicios;

public class Ejer05 {

	public static void main(String[] args) {
		int n = 4;
		System.out.println("La suma de los numeros desde 1 hasta "+n+" es: "+sumaNumeros(n));
	}
	
	public static int sumaNumeros(int n) {
		
		if(n == 1) {
			return 1;
		}
		
		return sumaNumeros(n-1)+n;
	}

}
