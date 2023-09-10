package Tema7;

import Tema7Persona.main;

public class CuentaCorriente {

	/**
	 * Atributos
	 */
	String dni;
	public String nombre;
	private int saldo;
	// al ser un metodo estatico, solo es accesible por metodos estaticos
	private static String banco = "International Java Bank";
	// hacemos que la clase CuentaCorriente tenga un objeto de tipo Gestor
	Gestor gestor;

	/**
	 * Constructores
	 */
	public CuentaCorriente(String dni, String nombre, int saldoInicial) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldoInicial;
	}

	public CuentaCorriente(String dni, String nombre) {
		this(dni, nombre, 0);
	};

	public CuentaCorriente(String dni, int saldoInicial) {
		this(dni, "Sin asignar", saldoInicial);
	}

	public CuentaCorriente(String dni, String nombre, Gestor gestor) {
		this(dni, nombre);
		this.gestor = gestor;
	}

	/**
	 * Comportamientos (metodos)
	 */
	public void mostrar() {
		System.out.println("Datos de la cuenta:");
		System.out.println("DNI: " + dni);
		System.out.println("Nombre propietario: " + nombre);
		System.out.println("Saldo en la cuenta: " + saldo);
		if (gestor == null) {
			System.out.println("No tiene ningun gestor");
		} else {
			gestor.mostrar();
		}

	}

	public void sacarDinero(int dinero) {
		// si hay mas saldo que dinero que se quiere sacar, se permite sacar dinero
		if (saldo >= dinero) {
			System.out.println("Es posible sacar dinero");
		} else {
			System.out.println("No es posible sacar saldo. No hay suficiente");
		}
	}

	public void ingresarDinero(int dinero) {
		saldo += dinero;
	}

	static String getBanco() {
		return banco;
	}

	static void setBanco(String nuevoNombre) {
		banco = nuevoNombre;
	}

	void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

}
