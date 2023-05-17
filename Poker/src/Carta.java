
public class Carta {

	private int valor;
	private int palo;

	public Carta(int valor, int palo) {
		this.palo = palo;
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}

	public String toString() {

		String valores[] = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jota",
				"Reina", "Rey" };
		String palos[] = { "Diamantes", "Corazones", "Picas", "Tréboles" };

		String nombreCarta = valores[valor - 1] + " de " + palos[palo];

		return nombreCarta;
	}

}
