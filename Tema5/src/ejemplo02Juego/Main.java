package ejemplo02Juego;

public class Main {

	public static void main(String[] args) {

		Juego juego = new Juego("Dark Souls", "Difícil", 16);
		
//		juego.nombre = "Dark Souls";
//		juego.dificultad = "Difícil";
//		juego.edadMinima = 16;
		

		//accedemos a los datos del juego
		System.out.println("Datos del juego");
		System.out.println("Nombre: "+juego.getNombre());
		
		System.out.println("Dificultad: "+juego.getDificultad());
		System.out.println("Edad mínima: "+juego.getEdadMinima());
		
		//nuevo juego
		Juego juego2 = new Juego();
		
		juego2.setNombre("Okami");
		juego2.setDificultad("Fácil");
		juego2.setEdadMinima(7);
		
		//accedemos a los datos del juego2
		System.out.println("\nDatos del juego 2");
		System.out.println("Nombre: "+juego2.getNombre());
		System.out.println("Dificultad: "+juego2.getDificultad());
		System.out.println("Edad mínima: "+juego2.getEdadMinima()+"\n");
		
		//asi mostramos los datos del juego2, según el metodo mostrar() de la clase Juego
		System.out.println("Otra forma de mostrar los datos de un juego");
		juego2.mostrar();
		
		Juego juego3 = new Juego("Mario");
		juego3.mostrar();
		

	}

}
