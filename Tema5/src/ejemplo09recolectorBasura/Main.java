package ejemplo09recolectorBasura;

public class Main {

	public static void main(String[] args) {

		final long NUM_OBJETOS = 1000000;
		
		for (int i = 1; i < NUM_OBJETOS; i++) {
			Coche coche = new Coche("1000ABC", "896342", "Ferrari", "A1");
		}

	}

}
