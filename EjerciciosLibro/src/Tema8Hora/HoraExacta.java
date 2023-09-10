package Tema8Hora;

public class HoraExacta extends Hora {

	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		// TODO Auto-generated constructor stub
		//si no se pone nada, es 0
		this.segundo = 0;
		if (!setSegundo(segundo)) {
			System.out.println("Segundos incorrectos");
		}
	}

	public boolean setSegundo(int valor) {
		if (valor < 0 || 59 < valor) {
			return false;
		}
		segundo = valor;
		return true;
	}

	@Override
	public void inc() {
		segundo++;
		if (segundo > 59) {
			segundo = 0;
			// ahora usamos el metodo se incrementar de la superclase, aumentando en +1 los
			// minutos
			// TODO Auto-generated method stub
			super.inc();
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String resultado = super.toString();
		resultado += ":" + segundo;
		return resultado;
	}

	@Override
	public boolean equals(Object obj) {
		HoraExacta nuevaHora = (HoraExacta) obj;

		if (this.hora == nuevaHora.hora && this.minuto == nuevaHora.minuto && this.segundo == nuevaHora.segundo) {
			return true;
		}

		return false;

	}

}
