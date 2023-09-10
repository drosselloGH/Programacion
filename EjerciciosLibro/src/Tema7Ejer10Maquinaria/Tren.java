package Tema7Ejer10Maquinaria;

import Tema7Ejer10Personal.Maquinista;

public class Tren {

	Locomotora locomotora;
	// max 5 vagones. Creamos un array para almacenarlos
	Vagon[] vagon;
	private int numVagones;
	Maquinista maquinista;

	public Tren(Locomotora locomotora, Maquinista maquinista) {
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		
		//al crear el tren, inicia sin tener ningun vagon añadido
		numVagones = 0;
	}
	
	/**
	 * Metodo que nos permite añadir un vagon al tren
	 * 
	 * @param cargaMax
	 * @param cargaActual
	 * @param mercancia
	 */
	public void anyadirVagon(int cargaMax, int cargaActual, String mercancia) {
		//cuando se ha alcanzado el numero maximo de vagones
		if(numVagones == 5) {
			System.out.println("No se pueden añadir más vagones");
		} else {
			//se crea un objeto Vagon, siendo el numero de vagones el ID del vagon
			Vagon v = new Vagon(numVagones, cargaMax, cargaActual, mercancia);
			//añadimos el vagon al array de vagones
			vagon [numVagones] = v;
			numVagones++;
		}
	}

}
