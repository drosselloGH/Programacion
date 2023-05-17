package pract2Simulador;

public class Simulador {

	public static void main(String[] args) {

		// al hacer la clase Componente abstracta, no la podemos usar como clase
//		Componente com1 = new Componente(200, 120);

		Diodo d1 = new Diodo(1, 90, 4.4);
		Diodo d2 = new Diodo(1, 90, 4.4);


		Condensador cnd1 = new Condensador(90, 2, 1.2);

		Led led1 = new Led(1.6, 1214121, 90.01, "Rojo");
//		System.out.println(led1.toString());
//
//		d1.leeDatos();
//
//		d1.mostrar();
//
//		Diodo d3 = new Led(2, 44, 1, "si");
		
		d1.equals(d2);
		System.out.println(d1.equals(d2));

	}

}
