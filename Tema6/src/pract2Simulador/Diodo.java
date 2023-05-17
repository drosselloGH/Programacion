package pract2Simulador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diodo extends Componente {

	private double tensionInversa;

	public Diodo(double intensidadMaxima, long longitud, double tensionInversa) {
		super(intensidadMaxima, longitud);
		this.tensionInversa = tensionInversa;
	}

	@Override
	public void conectar() {
		System.out.println("Componente Conectado");

	}

	public void leeDatos() {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Intensidad maxima: ");
			setIntensidadMaxima(sc.nextDouble());

			System.out.println("Longitud: ");
			setLongitud(sc.nextLong());

			System.out.println("Tension inversa");
			tensionInversa = sc.nextDouble();
			
			throw new Exception();
			
		} catch (InputMismatchException e) {
			System.out.println("Entrada incorrecta");
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("Fin lectura de datos");
			
		}

	}

	public void mostrar() {
		System.out.println(getIntensidadMaxima());
		System.out.println(getLongitud());
		System.out.println(tensionInversa);
	}

}
