import java.util.Scanner;

//pedir un precio y decir si corresponde un descuento del 10% (precio < 100)
//o del 20% 

public class Ejemplo06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Precio: ");
		int precio = sc.nextInt();

		int descuento;

		if (precio < 100) {
			descuento = 10;
			System.out.println(descuento);
		} else {
			descuento = 20;
			System.out.println(descuento);
		}

		// variable condicion ? valor_si_true : valo_si_false;
		descuento = (precio < 100) ? 10 : 20;

		// variable condicion ? valor_si_true : valo_si_false;

	}

}
