package ejemplo08Coche;

public class Coche {

	private String matricula;
	private String numBastidor;
	private String marca;
	private String modelo;

	// static hace que el valor de la varible sea igual para todos
	private static int descuento;

	public Coche(String matricula, String numBastidor, String marca, String modelo) {
		this.matricula = matricula;
		this.numBastidor = numBastidor;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void mostrar() {
		System.out.println(matricula);
		System.out.println(numBastidor);
		System.out.println(marca);
		System.out.println(modelo);
	}

	//hacemos que el metodo sea estatico
	public static int getDescuento() {
		return descuento;
	}

	public static void setDescuento(int descuento) {
		Coche.descuento = descuento;
	}

}
