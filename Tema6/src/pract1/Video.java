package pract1;

public class Video extends Medio {

	private String director;
	private String idioma;

	// al crear una clase abstracta, y, al ser una extension de Medio
	// debo crear un constructor con los mismos parametros que su padre
	// usando un super()
	public Video(String nombre, double duracion, String director, String idioma) {
		super(nombre, duracion);
		this.director = director;
		this.idioma = idioma;
	}

	@Override
	public void reproducir() {
		// TODO Auto-generated method stub

	}

}
