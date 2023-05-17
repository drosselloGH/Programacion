//Escribe un método que escriba en pantalla el nombre de un mes a partir de su número. En caso
//de que el número proporcionado no esté entre 1 y 12, deberá terminar inmediatamente

package hoja1;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el numero de un mes");
		int mes = sc.nextInt();
		
		nombreMes(mes);

	}

	static void nombreMes(int mes) {

		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		System.out.println("El nombre del mes "+mes+" es "+meses[mes -1]);
	}

}
