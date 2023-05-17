package pract2Simulador;

public abstract class Componente {

	private double intensidadMaxima;
	private long longitud;

	public Componente(double intensidadMaxima, long longitud) {
		this.intensidadMaxima = intensidadMaxima;
		this.longitud = longitud;
	}
	
	public double getIntensidadMaxima() {
		return intensidadMaxima;
	}


	public void setIntensidadMaxima(double intensidadMaxima) {
		this.intensidadMaxima = intensidadMaxima;
	}

	public long getLongitud() {
		return longitud;
	}

	public void setLongitud(long longitud) {
		this.longitud = longitud;
	}

	public abstract void conectar();

}
