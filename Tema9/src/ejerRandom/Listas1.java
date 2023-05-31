package ejerRandom;

import java.util.ArrayList;

public class Listas1 {

	public static void main(String[] args) {
		
		ArrayList<String> superheroes = new ArrayList();
		
		/*AÑADIMOS ELEMENTOS A LA LISTA*/
		superheroes.add("Jesucristo");
		superheroes.add("Dios");
		superheroes.add("Ryan Reynolds");
		
		//insertamos en la posicion indicada
		superheroes.add(2, "Spiderman");
		superheroes.add(0, "Batman");
		
		/*ACCEDER A UN ELEMENTO DE LA LISTA*/
		// hay que guardar el nombre en una variable
		String nombre = superheroes.get(2);
		System.out.println(nombre);
		
		/*ELIMINAR ELEMENTO DE LA LISTA*/
		String eleiminado = superheroes.remove(0);
		System.out.println("Hemos eliminado a: "+eleiminado);
		
		boolean otroFuera = superheroes.remove("Dios");
		if(otroFuera) {
			System.out.println("Se ha eliminado a Dios");
		} else {
			System.out.println("No se ha podido eliminar a Dios");
		}
		
		/*REEMPLAZAR ELEMENTO*/
		superheroes.set(0, "Batman");
		
		/*OBJETO DENTRO DE LISTA*/
		boolean estaDentro = superheroes.contains("Jesus");
		if(estaDentro) {
			System.out.println("Jesus esta dentro");
		} else {
			System.out.println("Jesus no está dentro");
		}
		
		/*BUSACR POSICION*/	
		int indice = superheroes.lastIndexOf("Ryan Reynolds");
		System.out.println("Posicion de Ryan Reynolds: "+indice);
		
		/*COMPROBAR LISTA VACÍA*/
		boolean vacia = superheroes.isEmpty();
		
		if(vacia) {
			System.out.println("La lista está vacía");
		} else {
			System.out.println("La lista no está vacia");
		}
		
		/*NUM ELEMENTOS*/
		int num = superheroes.size();
		System.out.println("La lista tiene: "+num+" elementos");
		
		/*BORRAR*/
		superheroes.clear();
		
		mostrarLista(superheroes);
		
	}
	
	private static void mostrarLista(ArrayList<String> superheroes) {
		
		System.out.println("\n=== LISTA HÉROES ===");
		
		/*RECORRER LA LISTA*/
		for(String heroe : superheroes) {
			System.out.println(heroe);
		}
		System.out.println("");
		
	}
	
}
