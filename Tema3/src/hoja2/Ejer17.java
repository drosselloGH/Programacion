//La siguiente tabla guarda una serie de calificaciones de varios alumnos. Guárdalas en un array,
//muéstralas en pantalla y calcula la nota media del curso

package hoja2;

public class Ejer17 {

	public static void main(String[] args) {

		String calificaciones[][] = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" },
				{ "Marcos Ramírez", "10" }, { "Juana Herranz", "4" }, { "Alberto López", "7" } };

		System.out.println("CALIFICACIONES");
		System.out.printf("%-21s %4s", "Alumno", "Nota");
		System.out.println();
		System.out.println("==========================");

		for (int fila = 0; fila < calificaciones.length; fila++) {

			//de este modo podremos poner una cantidad determinada de caracteres vacíos que haya
			System.out.printf("%-21s %4s", calificaciones[fila][0], calificaciones[fila][1]);
			System.out.println();
		}

		// calculamos la nota media
		int cantNotas = 0, sumaNotas = 0;

		for (int fila = 0; fila < calificaciones.length; fila++) {
			int nota = Integer.parseInt(calificaciones[fila][1]);

			sumaNotas += nota;

			cantNotas++;

		}

		System.out.println("\nLa nota media del curso es: " + (sumaNotas / cantNotas));
		
		//mostramos el alumno con la nota más baja
		
		int filaMin = 0;
		
		for (int fila = 1; fila < calificaciones.length; fila++) {
			if(Integer.parseInt(calificaciones[fila][1]) < Integer.parseInt(calificaciones[filaMin][1])) {
				filaMin = fila;
			}
		}
		System.out.println(calificaciones[filaMin][0]+" tiene la nota más baja, un "+calificaciones[filaMin][1]);
	}

}
