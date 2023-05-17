package pract2Simulador;

public class Led extends Diodo {

	private String color;

	public Led(double intensidadMaxima, long longitud, double tensionInversa, String color) {
		super(intensidadMaxima, longitud, tensionInversa);
		this.color = color;
	}

}
