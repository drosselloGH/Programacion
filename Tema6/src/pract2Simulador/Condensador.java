package pract2Simulador;

public class Condensador extends Componente implements Invertible {

	private double capacidad;

	public Condensador(double intensidadMaxima, long longitud, double capacidad) {
		super(intensidadMaxima, longitud);
		this.capacidad = capacidad;
	}

	@Override
	public void conectar() {
		System.out.println("Componente Conectado");

	}

	@Override
	public void girar() {
		System.out.println("Objeto girado");

	}

}
