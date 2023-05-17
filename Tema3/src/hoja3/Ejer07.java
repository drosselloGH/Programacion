//En una pizzería quieren un programa para anotar el tiempo que tardan en hacer cada reparto de
//comida a domicilio.
//Escribe una aplicación que cree un array de 15 elementos y vaya leyendo de consola los tiempos de
//entrega (en minutos) que han tenido los últimos 15 pedidos. A continuación, recorrerá el array y
//contará cuántos de los pedidos han superado los 30 minutos. Este dato es importante porque la
//empresa no cobra la pizza si ha tardado más de media hora en entregarla.
//Por último, el programa mostrará este nº de pedidos fallidos, y lo indicará también como porcentaje
//del total de pedidos hechos

package hoja3;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int minutos[] = new int[15];

		int pedidosLentos = 0;
		
		for (int i = 0; i < minutos.length; i++) {
			System.out.println("Cantidad minutos entrega " + (i + 1));
			minutos[i] = sc.nextInt();
			
			if(minutos[i] > 30) {
				pedidosLentos++;
			}
		}
		
		System.out.println("Se han entregado "+pedidosLentos+" pedidos con una duración de más de 30 minutos");
		System.out.println("Porcentaje de fallo: "+((pedidosLentos * 100) / minutos.length)+"% ");

	}

}
