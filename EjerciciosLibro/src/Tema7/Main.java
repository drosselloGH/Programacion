package Tema7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dia = sc.nextLine();
		
		//para convertir una cadena a un tipo "enum", se usa el metodo "valueOf()"
		DiasDeLaSemana ingles = DiasDeLaSemana.valueOf(dia);
		
	}

}
