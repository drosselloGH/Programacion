package Tema8Hora;

public class Hora {

	protected int hora;
	protected int minuto;

	public Hora(int hora, int minuto) {
		//valores pre definidos
		this.hora = 0;
		this.minuto = 0;
		// si los valores son correctos, se introduciran
		if (!setHora(hora)) {
			// si no lo son, se mostrará este mensaje
			System.out.println("Hora incorrecta");
		}
		if (!setMinutos(minuto)) {
			System.out.println("Minutos incorrectos");
		}
	}

	/**
	 * Incrementa la hora en un minuto
	 */
	public void inc() {
		minuto++;
		if (minuto > 59) {
			minuto = 0;
			hora++;
			if (hora > 23) {
				hora = 0;
			}
		}
	}

	public boolean setMinutos(int valor) {
		if (valor < 0 || 60 <= valor) {
			return false;
		}

		minuto = valor;
		return true;
	}

	public boolean setHora(int valor) {
		if (valor < 0 || 23 < valor) {
			return false;
		}

		hora = valor;
		return true;

	}

	@Override
	public String toString() {
		String horaFinal = "Hora = " + hora + ":" + minuto;
		return horaFinal;
	}
	

}
