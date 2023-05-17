//6.- Escribe un programa que pida por consola los precios de diez productos y los guarde en un array.
//Haz que después se muestren todos los valores mediante un bucle for.

package hoja1;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float[] productos = new float[10];
		
		float precio;
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println("Escribe el precio de un producto");
			productos[i] = sc.nextFloat();
		}
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println("El precio del producto "+i+ " es: "+productos[i]);
		}

	}

}
