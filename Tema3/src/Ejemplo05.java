
//ejemplo busqueda desordenada

public class Ejemplo05 {

	public static void main(String[] args) {

		String nombres[] = { "Dani", "Jaime", "Javier", "Aaron", "Mihai", "Alex", "Noelia", "Álvaro" };

		String nombreBuscado = "Pedro";

		boolean encontrado = false;

		int indiceBusqueda = 0;
		
		// queremos averiguar si el nombre Aaron esta dentro del array
		
		//opcion 1
		
		while (indiceBusqueda < nombres.length && nombres[indiceBusqueda] != nombreBuscado) {
			indiceBusqueda++;
		}
		
		if (indiceBusqueda < nombres.length) {
			System.out.println("El nombre "+nombreBuscado+" se encuentra en la posicion "+indiceBusqueda);
		} else {
			System.out.println("No se ha encontrado el nombre "+nombreBuscado);
		}
		
		
		//opcion 2
		
//				for (int i = 0; i < nombre.length; i++) {
//					if (nombre[i].equals(nombreBuscado)) {
//						System.out.println("Se ha encontrado el nombre " + nombreBuscado + " en la posicion " + i);
//						encontrado = true;
//						break;
//					}
//				}
//
//				if (!encontrado) {
//					System.out.println("No se ha encontrado el nombre " + nombreBuscado);
//				}

	}

}
