package Tema7;

public class MainLista {

	public static void main(String[] args) {

		Lista l1 = new Lista();
		
		l1.insertarFin(2);
		l1.insertarFin(3);
		l1.insertarFin(4);
		l1.insertarFin(5);
		l1.insertarFin(6);
		l1.insertarInicio(1);
		
		l1.mostrar();
		
		Lista l2 = new Lista();
		
		l2.insertarInicio(8);
		l2.insertarFin(9);
		l2.insertarFin(10);
		l2.insertarFin(11);
		l2.insertarFin(12);

		System.out.println(l2.eliminar(1));
		
		l2.mostrar();
	}

}
