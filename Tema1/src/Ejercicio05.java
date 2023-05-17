import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre producto: ");

		String nombreProducto = sc.next();

		System.out.print("Precio: ");

		float precio = sc.nextFloat();

		System.out.print("Descuento: ");
		float descuento = sc.nextFloat();

		// creamos cuanto descontamos al numero inicial
		float descuentoFinal = descuento / 100;

		// creamos cuanto es el porcentaje del descuento
		float precioFinal = precio * descuentoFinal;

		// calculamos cual es el precio total con el descuento aplicado
		float precioTotal = precio - precioFinal;

		System.out.print("Precio final: " + precioTotal);

	}

}