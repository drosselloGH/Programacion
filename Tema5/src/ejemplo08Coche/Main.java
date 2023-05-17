package ejemplo08Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche("2001NHG", "656532689865", "Volvo", "A1");
		Coche coche2 = new Coche("1001CFD", "633790812732", "Seat", "Córdoba");

		// al ser metodos estaticos, tanto setDescuento como getDescuento pueden ser
		// llamados anteponiendo el nombre de la clase, sin necesidad de crear un objeto
		// Coche
		Coche.setDescuento(25);
		System.out.println("descuento de cualquier coche: " + Coche.getDescuento());
		coche1.mostrar();

	}

}
