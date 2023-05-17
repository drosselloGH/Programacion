package examen;

//CORREGIR

public class Ejer03 {

	public static void main(String[] args) {
		String actores[][] = { { "Viggo Mortensen", "64", "30" }, { "Cate Blanchett", "53", "19" },
				{ "Ian McKellen", "83", "40" }, { "Miranda Otto", "55", "17" } };

		// actor que más peliculas ha hecho		
		for (int i = 0; i < actores.length -1; i++) {
			for (int j = i +1; j < actores.length; j++) {
				if(Integer.parseInt(actores[j][2]) > Integer.parseInt(actores[i][2])) {
					System.out.println("El actor con más películas realizadas es " + actores[j][0] + " ("
								+ actores[j][2] + " películas).");
					break;
				}
			}
			
		}

		// mostramos la media de peliculas realizadas por los actores
		double totalPeliculas = 0;

		for (int i = 0; i < actores.length; i++) {
			totalPeliculas += Double.parseDouble(actores[i][2]);

		}
		System.out.println("\nEl promedio de películas realizado por estos actores es de "
				+ totalPeliculas / actores.length + " películas.\n");

		// sumamos +1 a las edades de los actores
		System.out.println("La tabla, tras sumar 1 a la edad de cada actor, queda así:");
		for (int i = 0; i < actores.length; i++) {
			System.out.printf("%-17s %-5s %-5s", actores[i][0], (Integer.parseInt(actores[i][1]) + 1), actores[i][2]);
			System.out.println();
		}

	}

}
