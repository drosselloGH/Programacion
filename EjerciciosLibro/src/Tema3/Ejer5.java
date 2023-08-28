package Tema3;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, resultado;
		int numOperaciones = 0;
		
		do {
			System.out.println("Suma estos numeros");
			num1 = (int)(Math.random()*100+1);
			num2 = (int)(Math.random()*100+1);
			
			System.out.println(num1 +" + "+num2);
			
			resultado = sc.nextInt();
			
			if(resultado == num1 + num2) {
				numOperaciones++;
			}
			
		} while(resultado == (num1 + num2));
		
		System.out.println("Has realizado "+numOperaciones+" operaciones correctas");
		
		
	}

}
