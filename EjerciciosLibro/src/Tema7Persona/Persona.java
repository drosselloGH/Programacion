package Tema7Persona;

public class Persona {

	/*
	 * Atributos de la clase
	 */
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	// un atributo estatico hace que tenga el mismo valor para todos los objetos
	private static String hoy;

	/**
	 * Constructores de la clase
	 * 
	 * La principal idea de un constructor es la de asignar valores a sus atributos
	 */
	public Persona() {

	}
	
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		edad = 0;
		hoy = "?";
	}

	/**
	 * Comportamientos de la clase (Métodos)
	 */
	public void saludar() {
		System.out.println("Hola, qué tal?");
	}

	public void cumplirAños() {
		edad++;
	}

	public void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("DNI: " + dni);
		System.out.println("Edad: " + edad);
		System.out.println("Dia semana: " + hoy);
	}
	

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static String getHoy() {
		return hoy;
	}

	public static void setHoy(String hoy) {
		Persona.hoy = hoy;
	}

	//al ser un metodo estatico, solo puede usar atributos estaticos, y sin el "this"
	public static void hoyEs(int dia) {
		if (dia == 1) {
			hoy = "Lunes";
		} else if (dia == 2) {
			hoy = "Martes";
		} else if (dia == 3) {
			hoy = "Miercoles";
		} else if (dia == 4) {
			hoy = "Jueves";
		} else if (dia == 5) {
			hoy = "Viernes";
		} else if (dia == 6) {
			hoy = "Sabado";
		} else if (dia == 7) {
			hoy = "Domingo";
		} else {
			hoy = "?";
		}
	}
}
