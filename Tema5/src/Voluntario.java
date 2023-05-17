import java.util.Scanner;

public class Voluntario {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaración de las variables usadas.

		String[] candidatos = { "Elier Vázquez", "Daniel Rosselló", "Mihai Alexandru", "Aarón Mateo", "Noelia Martinez",
				"Gonzalo Rodriguez", "Sergio Garcías", "Aina Villalonga", "Alex Ken", "Juan Sánchez",
				"Álvaro Callejero", "Andrés Ribas", "Jaime López", "Álvaro Feria", "César Paredes", "Luis Miguel",
				"Javier Peralta", "Lluís Salas" };

		boolean quitarVoluntarios = false;
		boolean esPrimeraPregunta = true;

		mostrarTitulo();

		// Cantidad de candidatos
		System.out.println("\nHay " + candidatos.length + " voluntarios");

		// Este bucle sirve para eliminar algun voluntario, en caso de
		// que no haya asistido o ya haya participado en otro ejercicio.

		// Para saber si queremos quitar voluntarios.
		quitarVoluntarios = hayQueQuitarVoluntarios(true);
		do {

			mostrarListado(candidatos);

			// Quitar alumnos

			while (quitarVoluntarios) {

				// Pedimos el alumno que deseamos eliminar.

				System.out.println("Escribe el nombre del voluntario a quitar: ");
				String voluntarioEliminado = entrada.nextLine();

				//quitamos al alumno indicado de la lista
				quitarAlumno(candidatos, voluntarioEliminado);

				// Pedimos si quiere eliminar algun otro voluntario.

				System.out.println("¿Quieres elimintar algún otro " + "voluntario? S | N");
				String respuesta = entrada.nextLine();

				// En caso de que la respuesta no sea s, salimos del
				// bucle y cambiamos la variable eliminarCandidatos
				// para salir del bucle do while.

				if (!respuesta.toLowerCase().equals("s")) {

					eliminarCandidatos = false;
					break;

				}

			}

			// Esto sirve para que solo se muestre 1 vez la primera
			// pregunta.
			esPrimeraPregunta = false;

		} while (eliminarCandidatos);

		// Sacamos un voluntario aleatorio.
		String voluntario = voluntario(candidatos);

		// Imprimimos el nombre del voluntario.
		System.out.println("El voluntario es: " + voluntario);

	}

	public static void quitarAlumno(String[] candidatos, String voluntarioEliminado) {
		// Cambiamos el voluntario por null.

		for (int i = 0; i < candidatos.length; i++) {

			if (candidatos[i].toLowerCase().equals(voluntarioEliminado.toLowerCase())) {

				candidatos[i] = "null";
				break;

			}

		}
	}

	// Mostrar el listado de voluntarios.
	public static void mostrarListado(String[] candidatos) {

		for (int i = 0; i < candidatos.length; i++) {

			System.out.println((i + 1) + ")" + candidatos[i]);

		}
	}

	// Imprimir el titulo del programa de forma bonita.
	public static void mostrarTitulo() {

		for (int i = 0; i < 19; i++) {
			System.out.print("=");
		}

		System.out.println("\nVoluntarioSelector");

		for (int i = 0; i < 19; i++) {
			System.out.print("=");
		}
	}

	// Para saber si queremos quitar voluntarios.
	public static boolean hayQueQuitarVoluntarios(boolean primeraPregunta) {

		if (primeraPregunta) {

			System.out.println("¿Deseas quitar algun voluntario? " + "S | N");

		} else {
			System.out.println("¿Quieres elimintar algún otro " + "voluntario? S | N");

		}

		String respuesta = entrada.nextLine();

		// En caso de que sea n, salimos del bucle, si no,
		// entramos en otro.

		if (!respuesta.toLowerCase().equals("n")) {

			return true;

		}

		return false;

	}

	static String voluntario(String[] candidatos) {

		while (true) {

			// Hacemos un Math.random() para elegir 1 voluntario.

			int voluntario = (int) (Math.random() * candidatos.length);

			// Si el voluntario no es null, salimos del bucle, si no,
			// volvemos a elegir otro voluntario.

			if (!candidatos[voluntario].equals("null")) {

				return candidatos[voluntario];

			}

		}
	}

}