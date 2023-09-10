package Tema7Ejer10Personal;

import java.time.LocalDateTime;

public class JefeEstacion {

	String nombre;
	String dni;
	LocalDateTime fechaNombramiento;
	
	public JefeEstacion(String nombre, String dni, LocalDateTime fecha) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNombramiento = fecha;
	}
	
}
