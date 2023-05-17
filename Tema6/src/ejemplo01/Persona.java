package ejemplo01;

public abstract class Persona {

	// cambiamos los atributos a protected, asi sus herencias tendrian acceso a los
	// atributos, aun asi, actuarian como privados
	private String nombre;
	private String apellidos;
	private String dni;
	//si hacemos los atributos privados, accedemos a ellos mediante los getters
	
	//queremos que todas las clases hijas esten obligadas a tener un metodo darDeAlta(),
	//que servira para leer los datos desde la terminal
	public abstract void darDeAlta();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void mostrar() {
		System.out.println("Datos de la persona: ");
		System.out.println("Nombre " + nombre);
		System.out.println("Apellidos " + apellidos);
		System.out.println("DNI " + dni);
	}
	
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

}
