package ejerRandom;

public class Jugador {

	private String nombre;
	private String puntuacion;
	
	public Jugador(String nombre, String puntuaciones) {
		this.nombre = nombre;
		this.puntuacion = puntuaciones;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}
	
}
