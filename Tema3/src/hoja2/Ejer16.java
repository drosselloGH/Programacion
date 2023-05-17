//La siguiente tabla guarda una serie de calificaciones de varios alumnos. Guárdalas en un array,
//muéstralas en pantalla y calcula la nota media del curso

package hoja2;

public class Ejer16 {

	public static void main(String[] args) {

		String calificaciones[][] = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" },
				{ "Marcos Ramírez", "10" }, { "Juana Herranz", "4" }, { "Alberto López", "7" } };

		System.out.println("CALIFICACIONES");
		System.out.println("==================");

		for (int fila = 0; fila < calificaciones.length; fila++) {

			for (int columna = 0; columna < calificaciones[fila].length; columna++) {
				System.out.print(calificaciones[fila][columna] + "\t" + calificaciones[fila][columna]);
			}
			System.out.println();
		}
		System.out.println();

		// calculamos la nota media
		int cantNotas = 0, sumaNotas = 0;

		for (int fila = 0; fila < calificaciones.length; fila++) {
			int nota = Integer.parseInt(calificaciones[fila][1]);

			sumaNotas += nota;

			cantNotas++;

		}

		System.out.println("\nLa nota media del curso es: " + (sumaNotas / cantNotas));

	}

}
