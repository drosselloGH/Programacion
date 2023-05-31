package ejerRandom;

public class Recursividad3 {

	public static void main(String[] args) {

		int num = 12;
		System.out.println(aHex(num));
	}

	private static String aHex(int n) {

		// caso base
		if (n == 0) {
			return "";
		} else if (n <= 9) {
			return "" + n;
		}

		int resto = n % 16;

		// caso recursivo
		return aHex(n / 16) + sacarResto(resto);
	}

	private static char sacarResto(int n) {
		char letras[] = { 'A', 'B', 'C', 'D', 'E', 'F'};
		
		return letras[n -10];
	}

}
