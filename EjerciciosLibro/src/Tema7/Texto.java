package Tema7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {

	/**
	 * Atributos
	 */
	private String cadenaCaracteres;
	private int longitudMaxima;
	private static final String VOCALES = "aeiouáéíóú";
	private LocalDate fechaCreado;
	private LocalDateTime fechaUltimaModificacion;

	/**
	 * Constructor
	 */
	public Texto(int longitud) {
		// la cadena esta vacia, no puede ser "null"
		cadenaCaracteres = "";
		this.longitudMaxima = longitud;
		fechaCreado = LocalDate.now();
		// aun no se ha creado nada
		fechaUltimaModificacion = null;
	}

	/**
	 * Metodos
	 */
	// añade un caracter al final, si es posible
	public void addFinal(char c) {
		if (cadenaCaracteres.length() < longitudMaxima) {
			// añadimos el caracter al final
			cadenaCaracteres += c;
			// cambiamos la fecha de modificacion
			fechaUltimaModificacion = LocalDateTime.now();
		}
	}

	// añade una subcadena al final, si es posible
	public void addFinal(String frase) {
		if (frase.length() + frase.length() < longitudMaxima) {
			// añadimos la frase al final
			cadenaCaracteres += frase;
			// cambiamos la fecha de modificacion
			fechaUltimaModificacion = LocalDateTime.now();
		}
	}

	// añade un caracter al principio, si es posible
	public void addInicio(char c) {
		if (cadenaCaracteres.length() < longitudMaxima) {
			// añadimos el caracter al inicio
			cadenaCaracteres = c + cadenaCaracteres;
			// cambiamos la fecha de modificacion
			fechaUltimaModificacion = LocalDateTime.now();
		}
	}
	
	//añade una subcadena al principio, si es posible
	public void addInicio(String frase) {
		if(cadenaCaracteres.length() + frase.length() < longitudMaxima) {
			//añadimos la frase al inicio
			cadenaCaracteres = frase + cadenaCaracteres;
			//cambiamos la fecha de modificacion
			fechaUltimaModificacion = LocalDateTime.now();
		}
	}
	
	public void mostrar() {
		System.out.println("Texto creado: "+cadenaCaracteres);
		System.out.println("Fecha creación: "+fechaCreado);
		System.out.println("Fecha última modificación: "+fechaUltimaModificacion);
	}
	
	public void contarVocales() {
		
		int cantVocales = 0;
		
		for (int i = 0; i < cadenaCaracteres.length(); i++) {
			if(esVocal(cadenaCaracteres.charAt(i))) {
				cantVocales++;
			}
		}
	}
	
	public boolean esVocal(char c) {
		
		//convertimos el caracter a uno en minuscula, pues la cadena con las vocales está en minuscula
		char caracter = Character.toLowerCase(c);
		
		if(VOCALES.indexOf(c) != -1) {
			return true;
		}
		
		return false;
		
	}

}
