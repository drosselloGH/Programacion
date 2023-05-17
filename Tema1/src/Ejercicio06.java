import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nombre producto: ");
		String nombreProducto = sc.next();

		// precio del producto
		System.out.print("Precio: ");
		float precio = sc.nextFloat();

		// cantidad de cosas compradas
		System.out.print("Cantidad unidades vendidas: ");
		int cantidadVentas = sc.nextInt();

		// mostramos cuanto ha costado toda la compra
		System.out.print("Coste total de la compra: " + cantidadVentas * precio);

	}

}
