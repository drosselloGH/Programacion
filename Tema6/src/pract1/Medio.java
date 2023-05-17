package pract1;

public abstract class Medio {

	private String nombre;
	private double duracion;

	// al crear un metodo abstracto en la clase padre,
	// obligo a su herencia a tener este metodo
	public abstract void reproducir();

	public Medio(String nombre, double duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
	}
}
