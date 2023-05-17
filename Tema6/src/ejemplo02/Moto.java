package ejemplo02;

public class Moto extends Vehiculo {

	private static int cilindrada;

	public Moto(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}
	
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public static int getCilindrada() {
		return cilindrada;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("\tCilindrada: " + cilindrada+"cc");

	}

}
