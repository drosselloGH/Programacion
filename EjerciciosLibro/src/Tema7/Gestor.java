package Tema7;

public class Gestor {

	/**
	 * Atributos
	 */
	public String nombre;
	private String telefono;
	int importeMaxAut;

	/**
	 * Constructor
	 */
	public Gestor(String nombre, String telefono, int importe) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMaxAut = importe;
	}

	public Gestor(String nombre, String telefono) {
		//asignamos el importe maximo autorizado
		this(nombre, telefono, 10000);
	}

	/**
	 * Metodos
	 * @return
	 */
	public String getTelefono() {
		return telefono;
	}
	
	void mostrar() {
		System.out.println("Información del gestor:");
		System.out.println("\tNombre: "+nombre);
		System.out.println("\tTeléfono: "+telefono);
		System.out.println("\tImporte máximo: "+importeMaxAut+" euros");
	}

}
