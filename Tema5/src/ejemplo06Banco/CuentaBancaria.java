package ejemplo06Banco;

public class CuentaBancaria {
	private int saldo;

	public CuentaBancaria(int saldo) {
		this.saldo = saldo;
	}

	public void depositar(int cantidad) {
		saldo = saldo + cantidad;
	}
	
	//depositar(int cantidad, int comision)
	//añade la cantidad quitandole la comision
	public void depositar(int cantidad, int comision) {
		saldo = saldo + cantidad - comision;
	}
	
	//retirar cantidad y comision
	public boolean retirar(int cantidad, int comision) {
		if (cantidad + comision <= saldo) {
			saldo = saldo - (cantidad + comision);
			return true;
		}
		return false;
	}

	public boolean retirar(int cantidad) {
		if (cantidad <= saldo) {
			saldo = saldo - cantidad;
			return true;
		}
		return false;
	}

	public int obtenerSaldo() {
		return saldo;
	}
}
