package Tema7;

public class Hora {

	/**
	 * Atributos
	 */
	private int hora;
	private int minuto;
	private int segundo;

	/**
	 * Metodos
	 */
	public int getHora() {
		return hora;
	}
	
	public void setHora(int nuevaHora) {
		if(0 < nuevaHora && nuevaHora<= 23) {
			this.hora = nuevaHora;
		} else {
			hora = 0;
		}
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public void setMinuto(int nuevoMinuto) {
		if(0 < nuevoMinuto && nuevoMinuto <= 59) {
			this.minuto = nuevoMinuto;
		} else {
			minuto = 0;
		}
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public void setSegundo(int nuevoSegundo) {
		if(0 < nuevoSegundo && nuevoSegundo <= 59) {
			this.segundo = nuevoSegundo;
		} else {
			segundo = 0;
		}
	}
	
	public void incrementarSegundo() {
		segundo++;
		if(segundo == 60) {
			segundo = 0;
			minuto ++;
			if(minuto == 60) {
				minuto = 0;
				hora++;
				if(hora == 24) {
					hora = 0;
				}
			}
		}
	}
}
