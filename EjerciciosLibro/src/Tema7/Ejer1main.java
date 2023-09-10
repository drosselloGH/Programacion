package Tema7;

public class Ejer1main {

	public static void main(String[] args) {
		
		CuentaCorriente c1 = new CuentaCorriente("45186289Y", "Daniel");

//		c1.ingresarDinero(300);
//		c1.mostrar();
//		c1.ingresarDinero(700);
//		c1.mostrar();
//
//		c1.sacarDinero(300);
//		c1.mostrar();
//		c1.sacarDinero(10000);
		
		CuentaCorriente c2 = new CuentaCorriente("45186273H", "Paco");
		c2.mostrar();
		
		//la clase principal puede acceder a metodos estaticos
		//(tambien los objetos del tipo de la clase, aunque no es lo suyo)
		CuentaCorriente.setBanco("CaixaBank");
		
		//para añadir los datos del gestor al cliente, antes hay que crear el gestor
		Gestor g1 = new Gestor("Sergio", "Chan", 5120);
		
		c1.setGestor(g1);
		c1.mostrar();
		
		
	}
	
}
