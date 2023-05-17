package ejemplo06Banco;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria cuenta = new CuentaBancaria(7000);

		cuenta.depositar(200);
		int saldo = cuenta.obtenerSaldo();
		System.out.println("Saldo de " + saldo + " euros");
		
		boolean retirar = cuenta.retirar(2000);
		if(retirar) {
			System.out.println("Puede retirar el dinero");
		} else {
			System.out.println("Operación denegada");
		}

		System.out.println(cuenta.obtenerSaldo());
		
		System.out.println("\nDepositamos 50 euros con 2 euros de comision");
		cuenta.depositar(50, 2);		
		System.out.println(cuenta.obtenerSaldo());
		
		System.out.println("\nRetiramos 100 euros con una comision de 3 euros");
		boolean retirarComision = cuenta.retirar(100, 3);
		if (retirarComision){
			System.out.println("puede retirar el dinero");
			System.out.println(cuenta.obtenerSaldo());
		} else {
			System.out.println("operacion denegada");
		}
		
	}

}
