//ejemplo de imprimir un array bidimensional sin que se descoloquen las columnas


public class ejemplo13 {

	public static void main(String[] args) {

		String calificaciones[][] = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" },
				{ "Marcos Ramírez", "10" }, { "Juana Herranz", "4" }, { "Alberto López", "7" } };

		System.out.println("CALIFICACIONES");
		System.out.println("==================");
		
		//mostraremos los datos ocupando 22 caracteres la columna Nombre y 4 caracteres la columna Nota

		System.out.printf("%-22s %-2s \n","Nombre", "Nota");
		
		for (int fila = 0; fila < calificaciones.length; fila++) {

			System.out.printf("%-22s %-4s", calificaciones[fila][0], calificaciones[fila][1]);
			System.out.println();
		}

		int cantidad = 5, total = 20;

		String campo1 = "Jose Luis Martínez";
		String campo2 = "7";

		// cuanto espacio debe ocupar la String
		// -30 ocupa los espacios hacia la izquierda
		// 30 ocupa los espacios hacia la derecha
		System.out.printf("%-30s %s", campo1, campo2);

	}

}
