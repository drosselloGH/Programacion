package ejemplos;

public class Jugador {

	private String nombre;
	private int puntuacion;
	
	public Jugador(String nombre, int puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if(obj instanceof Jugador) {
			Jugador jugador = (Jugador) obj;
			if(nombre.equals(jugador.getNombre()) && puntuacion == jugador.getPuntuacion()) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

}
