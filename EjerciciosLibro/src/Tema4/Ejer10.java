package Tema4;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		int num = sc.nextInt();
		
		System.out.println("Escribe un exponente");
		int exp = sc.nextInt();
		
		if(exp < 0) {
			System.out.println("El exponente debe ser positivo");
			while(exp < 0) {
				System.out.println("Escribe un exponente");
				exp = sc.nextInt();
			}
		}
		
		System.out.println(num+"^"+exp);
		
		System.out.println(recursiva(num, exp));

	}
	
	/**
	 * 
	 * @param a -> numero base
	 * @param n -> exponente
	 * @return 
	 */
	private static int iterativa(int a, int n) {
		
		int resultado = 1;
		
		for(int i = 1; i <= n; i++) {
			resultado = resultado * a;
		}
		
		return resultado;
	}
	
	/** 
	 * 
	 * @param a -> numero base
	 * @param n -> exponente
	 * @return
	 */
	private static int recursiva(int a, int n) {
		//caso base
		if(n == 0) {
			return 1;
		} else if(n == 1) {
			return a;
		}
		
		//caso recursivo
		return a * recursiva(a, n -1);
		
	}

}
