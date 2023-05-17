//Escribe un programa que pida los coeficientes a, b y c de una ecuación de segundo grado
//(ax2+bx+c=0). A continuación mostrará las dos soluciones de la ecuación. Usa dos métodos que
//tomen como parámetros los coeficientes a, b y c, y devuelvan cada uno una solución de la ecuación

package hoja1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor 'a'");
		int a = sc.nextInt();

		System.out.println("Valor 'b'");
		int b = sc.nextInt();

		System.out.println("Valor 'c'");
		int c = sc.nextInt();

		
		//comprobamos si la ecuacion tiene solucion
		if(delta(a, b, c) < 0) {
			System.out.println("No se puede resolver");
			return;
		}
		
		System.out.println("Solción 1: "+solucion2grado1(a, b, c));
		System.out.println("Solución 2: "+ solucion2grado2(a, b, c));
		

	}

	static double solucion2grado1(int a, int b, int c) {
		double interior = delta(a, b, c);

		double parteArriba = -b - (Math.sqrt(interior));

		double union = parteArriba / (2 * a);

		return union;
	}

	static double solucion2grado2(int a, int b, int c) {
		double interior = delta(a, b, c);

		double parteArriba = -b + (Math.sqrt(interior));

		double union = parteArriba / (2 * a);

		return union;
	}
	
	static double delta (int a , int b, int c) {
		return Math.pow(b, 2) - (4 *a *c);
	}

}
