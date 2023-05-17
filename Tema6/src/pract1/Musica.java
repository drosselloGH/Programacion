package pract1;

public class Musica extends Medio {

	private String artista;
	private String estilo;
	
	//al crear una clase abstracta, y, al ser una extension de Medio
	//debo crear un constructor con los mismos parametros que su padre
	//usando un super()
	public Musica(String nombre, double duracion, String artista, String estilo) {
		super(nombre, duracion);
		this.artista = artista;
		this.estilo = estilo;
	}
	
	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		
	}
	
}
