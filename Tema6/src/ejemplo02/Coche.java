package ejemplo02;

public class Coche extends Vehiculo {

	private int potencia;

	public Coche(String matricula, String marca, String modelo, int potencia) {
		super(matricula, marca, modelo);
		this.potencia = potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void mostrar() {
		//mediante la palabra "super.", usamos metodos de la clase padre
		super.mostrar();
		System.out.println("\tPotencia: " + potencia+"cv");

	}

}
