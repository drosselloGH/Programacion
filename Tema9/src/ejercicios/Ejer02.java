package ejercicios;
public class Ejer02 {
	public static void main(String[] args) {
		
		int num = 5;
		
		System.out.println("El binario de "+num+" es: "+aBinario(num));
	}
	
	private static String aBinario(int n) {
		String binario = "";
		
		while(n > 0) {
			int resto = n % 2;
			binario = resto + binario;
			
			n = n / 2;
			
		}
		
		
		return binario;
	}
}
