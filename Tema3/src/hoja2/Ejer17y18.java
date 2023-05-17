//La siguiente tabla guarda una serie de calificaciones de varios alumnos. Guárdalas en un array,
//muéstralas en pantalla y calcula la nota media del curso

package hoja2;

public class Ejer17y18 {

	public static void main(String[] args) {

		String calificaciones[][] = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" },
				{ "Marcos Ramírez", "10" }, { "Juana Herranz", "4" }, { "Alberto López", "7" } };

		System.out.println("CALIFICACIONES");
		System.out.println("==================");

		for (int fila = 0; fila < calificaciones.length; fila++) {

			for (int columna = 0; columna < calificaciones[fila].length; columna++) {
				System.out.printf(calificaciones[fila][columna] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		int cantNotas = 0, sumaNotas = 0;

		for (int fila = 0; fila < calificaciones.length; fila++) {
			int nota = Integer.parseInt(calificaciones[fila][1]);

			sumaNotas += nota;

			cantNotas++;

		}

		int filaMin = 0, filaMax = 0;
		
		//proceso para saber la columna con el numero mas alto/bajo,
		//y también para saber quien tiene la nota más baja 
		for (int fila = 1; fila < calificaciones.length; fila++) {
			if(Integer.parseInt(calificaciones[fila][1]) < (Integer.parseInt(calificaciones[filaMin][1]))) {
				filaMin = fila;
			} else if(Integer.parseInt(calificaciones[fila][1]) > (Integer.parseInt(calificaciones[filaMax][1]))) {
				filaMax = fila;
			}
		}

		System.out.println("\nLa nota media del curso es: " + (sumaNotas / cantNotas)+"\n");
		
		System.out.println(calificaciones[filaMin][0]+" tiene la nota más baja, un "+calificaciones[filaMin][1]);
		System.out.println(calificaciones[filaMax][0]+" tiene la nota más alta, un "+calificaciones[filaMax][1]);
		
	}

}
