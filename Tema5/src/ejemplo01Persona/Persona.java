package ejemplo01Persona;

public class Persona {

	// atributos de la clase
	private String nombre;
	private String apellidos;
	private int anyoNacimiento;
	private String dni;

	// constructores de la clase
	public Persona() {

	}

	public Persona(String nombre, String apellidos, int anyoNacimiento, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anyoNacimiento = anyoNacimiento;
		this.dni = dni;
	}

	// si no hay dni, mostrará esta frase
	public Persona(String nombre, String apellidos, int anyoNacimiento) {
		// busca el constructor con los tipos de datos indicados en las variables, y no
		// hace falta escribir otra vez el código
		this(nombre, apellidos, anyoNacimiento, "No disponible");
	}

	public Persona(String nombre, String apellidos) {
		this(nombre, apellidos, 0, "No disponible");
	}

	// metodos de la clase
	public void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos:" + apellidos);
		System.out.println("Año nacimiento: " + anyoNacimiento);
		System.out.println("DNI: " + dni);
	}

	// metodos de acceso
	public String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

	public String getDni() {
		return dni;
	}

	void setDni(String dni) {
		this.dni = dni;
	}

}
