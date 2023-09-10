package Tema7Ejer10Personal;

public class Mecanico {

	String nombre;
	int telefono;

	// al haber creado una enumeracion con el nombre "especialidad", hay que crear
	// un atributo del mismo tipo
	enum Especialidad {
		frenos, hidraulica, electricidad, motor
	}; // definicion del tipo enumerado

	Especialidad tipo; // declaracion del tipo enumerado

	public Mecanico(String nombre, int telefono, Especialidad tipo) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.tipo = tipo;
	}
	
	//tambien se puede poner una enumeracion de esta forma, pasandole un String
	public Mecanico(String tipo) {
		this.tipo = Especialidad.valueOf(tipo);
	}

}
