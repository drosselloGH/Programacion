package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo04 {
/*
 * Actividad: crear lista llamada heroes y ve añadiendo elementos y probando todos los métodos de los ArrayList
 * */
	public static void main(String[] args) {

		List<String> heroes = new ArrayList<>();
		
		heroes.add("Jesucristo");
		heroes.add("Ryan Reynods");
		heroes.add("Batman");
		
		mostrarHeroes(heroes);
		
		heroes.add("Aguja dinámica");
		mostrarHeroes(heroes);
		
		heroes.remove(2);
		mostrarHeroes(heroes);
		
		System.out.println("En la lista heroes hay "+heroes.size()+" heroes");
		
		if(!heroes.contains("Spiderman")) {
			System.out.println("La lista no contiene a Spiderman");
		}
		
		heroes.set(2, "Spiderman");
		
		mostrarHeroes(heroes);
		
		if(heroes.contains("Spiderman")) {
			System.out.println("La lista contiene a Spiderman");
		}
		
		if(heroes.isEmpty()) {
			System.out.println("La lista esta vacia");
		} else {
			System.out.println("La lista no esta vacia");
		}
		
		System.out.println("La lista contiene "+heroes.size()+" heroes");
		
		mostrarHeroes(heroes);
		
		System.out.println("El primer heroe de la lista es "+heroes.get(0));
		
		heroes.clear();


	}
	
	public static void mostrarHeroes(List<String> heroes) {
		System.out.println("Lista de Heroes");
		System.out.println("===============");
		for(String persona: heroes) {
			System.out.println(persona);
		}
		System.out.println();
	}

}
