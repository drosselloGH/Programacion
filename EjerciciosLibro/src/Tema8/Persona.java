package Tema8;

public class Persona extends Object {

	String nombre;
	int edad;
	int estatura;

	public Persona() {

	}

	public Persona(String nombre, int edad, int estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	public void mostrar() {
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(estatura);
	}

	@Override
	// al hacer una extension de Object, el metodo toString() debe ser de ambito
	// publico
	public String toString() {
		String cadena = "Persona: " + nombre + ". Edad: " + edad + ". Estatura: " + estatura;
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		// hacemos un casteo para poder convertir al objeto pasado como parametro a un
		// objeto de tipo Persona
		Persona otraPersona = (Persona) obj;
		// usamos el atributo de la clase Persona para compararlo con el objeto pasado
		// como parametro, pues no hemos creado un objeto tipo Persona para esto
		if (this.nombre.equals(otraPersona.nombre) && this.edad == otraPersona.edad
				&& this.estatura == otraPersona.estatura) {
			return true;
		}
		return false;
	}

}
