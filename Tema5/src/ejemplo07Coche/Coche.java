package ejemplo07Coche;

public class Coche {

	 String matricula;
	 String numBastidor;
	 String marca;
	 String modelo;

	// static hace que el valor de la varible sea igual para todos
	private static int descuento;

	public Coche(String matricula, String numBastidor, String marca, String modelo) {
		this.matricula = matricula;
		this.numBastidor = numBastidor;
		this.marca = marca;
		this.modelo = modelo;
	}

}
