package Tema1;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero positivo o negativo");
		int num = sc.nextInt();
		//si se cumple la condicion, se aplica la primera opcion, sino, la otra
		int valorAbsoluto = num < 0 ? -1 * num : num;
		
		System.out.println(valorAbsoluto);

	}

}
