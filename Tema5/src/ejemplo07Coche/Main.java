package ejemplo07Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche("2001NHG", "656532689865", "Volvo", "A1");
		Coche coche2 = new Coche("1001CFD", "633790812732", "Seat", "Córdoba");

		// si cambiamos el valor de un atributo no estático en un objeto solo afecta a
		// ese objeto
		coche1.matricula = "0000AAA";
		System.out.println("Matricula coche2: " + coche2.matricula);

		// vemos que el descuento, al ser estático, se ha cambiado para el coche 2
		// si cambiamos el valor de un atributo estatico, cambia el valor de todos los
		// objotes de esa misma clase
		coche1.descuento = 10;
		System.out.println("Descuento del coche2: " + coche2.descuento);

		// para manejar atributos estaticos, podemos usar el nombre de la clase en vez
		// del nombre de un objeto de la clase
		Coche.descuento = 20;
		System.out.println("\nDescuento de todos los coches: " + Coche.descuento);

	}

}
