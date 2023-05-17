package ejemplo02Juego;

public class Juego {

	//atributos de la clase
	private String nombre;
	private String dificultad;
	private int edadMinima;
	
	public Juego(){
		
	}
	
	public Juego(String nombre, String dificultad, int edadMinima){
		this.dificultad = dificultad;
		this.edadMinima = edadMinima;
		this.nombre = nombre;
	}
	
	public Juego(String nombre){
		this(nombre, "Inexistente", 0);
	}
	
	//metodos de la clase
	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Dificultad: "+dificultad);
		System.out.println("Edad mínima para jugar: "+edadMinima);
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDificultad() {
		return dificultad;
	}
	
	void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	
	public int getEdadMinima() {
		return edadMinima;
	}
	
	void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
}
