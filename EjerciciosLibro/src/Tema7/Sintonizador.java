package Tema7;

public class Sintonizador {

	private static double frecuencia = 80;
	
	/**
	 * Metodos
	 */
	public double up() {
		frecuencia += 0.5;
		comprobarFrecuencia();
		return frecuencia;
	}
	
	public double down() {
		frecuencia -= 0.5;
		comprobarFrecuencia();
		return frecuencia;
	}
	
	public void comprobarFrecuencia() {
		if(frecuencia > 108) {
			frecuencia = 80;
		} else if(frecuencia < 80) {
			frecuencia = 108;
		}
	}
	
	public void display() {
		System.out.println("Frecuencia: "+frecuencia+" MHz");
	}
	
}
