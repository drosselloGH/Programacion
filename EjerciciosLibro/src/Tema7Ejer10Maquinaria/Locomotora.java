package Tema7Ejer10Maquinaria;

import Tema7Ejer10Personal.Mecanico;

public class Locomotora {

	String matricula;
	int potencia;
	int anyoFabricacion;
	Mecanico mecanico;

	public Locomotora(String matricula, int potencia, int fecha, Mecanico mecanico) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.anyoFabricacion = fecha;
		this.mecanico = mecanico;
	}

}
