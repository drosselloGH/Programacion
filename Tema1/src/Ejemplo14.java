
public class Ejemplo14 {

	public static void main(String[] args) {

		//si usamos println en vez de print, 
		//se crea un salto de línea
		System.out.print("Hola ");
		System.out.print("Cómo ");
		System.out.print("Estás");
		System.out.println();

		
		//podemos concatenar cadenas usando "+"
		String nombre = "Daniel";
		String apellido = "Rosselló";
		System.out.println("Hola, me llamo " + nombre + " " + apellido);

		//caracteres de control
		System.out.println("Dirección:\tSon Ferrer");
		System.out.println("Dirección:\nSon Ferrer");
		System.out.println("Dirección: \'Son Ferrer\'");
		System.out.println("Dirección: \"Son Ferrer\"");
		System.out.println("Dirección: \\Son Ferrer\\");




		
	}

}