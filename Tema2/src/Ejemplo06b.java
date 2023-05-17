import java.util.Scanner;

//pedir un precio y decir si corresponde un descuento del 10% (precio < 100)
//o del 20% 

public class Ejemplo06b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Precio: ");
		
		if (sc.hasNextFloat()) {
			float precio = sc.nextFloat();
			int descuento = (precio < 100) ? 10 : 20;
			System.out.println(descuento+ " % de descuento");
			
		} else {
			System.out.println("Escribe un número");
		}

	}

}
