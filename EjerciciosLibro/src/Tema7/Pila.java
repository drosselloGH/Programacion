package Tema7;

public class Pila {

	private Lista lista;

	public Pila() {
		// al crear una pila, creamos una lista
		lista = new Lista();
	}

	public void apilar(int num) {
		lista.insertarFin(num);
	}

	public Integer desapilar() {
		return lista.eliminar(lista.lista.length-1);
	}
	
	public void mostrar() {
		lista.mostrar();
	}
}
