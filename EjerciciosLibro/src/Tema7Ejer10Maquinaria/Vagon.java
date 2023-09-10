package Tema7Ejer10Maquinaria;

class Vagon {

	int identificador;
	int cargaMax;
	int cargaActual;
	String tipoMercancia;

	public Vagon(int id, int cargaMax, int cargaAct, String mercancia) {
		this.identificador = id;
		this.cargaMax = cargaMax;
		this.cargaActual = cargaAct;
		this.tipoMercancia = mercancia;
	}

}
