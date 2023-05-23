package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo07ArrayList {

	public static void main(String[] args) {
		
		//creamos una lista de objetos Jugador
		List<Jugador> jugadores = new ArrayList<Jugador>();
		
		//añadimos algunos jugadores a la lista
		jugadores.add(new Jugador("Carlos", 10));
		jugadores.add(new Jugador("Juan", 10));
		jugadores.add(new Jugador("Dani", 9));
		jugadores.add(new Jugador("Cesar", 9));
		jugadores.add(new Jugador("Andres", 8));
		jugadores.add(new Jugador("Noelia", 9));
		
		//borramos a Dani
		Jugador jugador = new Jugador("Carlos", 10);
		jugadores.remove(jugador);
		
		//borramos a daniel
		jugadores.remove(new Jugador("Dani", 9));
		
		for(Jugador jug : jugadores) {
			System.out.println("Nombre: "+jug.getNombre()+", puntos: "+ jug.getPuntuacion());
		}
		
//		Jugador jugador2 = new Jugador("Carlos", 10);
		
//		System.out.println("Son iguales? "+jugador2.equals(jugador2));
		
		
		
	}
	
}
