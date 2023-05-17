
public class NombreAleatorio {

	public static void main(String[] args) {

		String alumnos[] = { "Aarón Mateo Ayala Cantuña", "Álvaro Callejero Colom", "Mihai Alexandru Cordeanu",
				"Álvaro Feria Pérez de Algaba", "Sergio Garcías Maldonado", "Jaime López Pesquera",
				"Noelia Martínez García", "Luis Miguel Morales Vílchez", "Alex Ken Moreno Nomura",
				"César Paredes Espinar", "Javier Peralta Garrido", "Andrés Ribas Pérez", "Gonzalo Rodríguez Romero",
				"Daniel Rosselló Oliver", "Lluís Salas Ferrer", "Juan Sánchez Hecht", "Elier Vázquez del Valle",
				"Aina Villalonga Gazulla" };

		System.out.println(voluntario(alumnos));

	}

	// devuelve un nombre aleatorio
	static String voluntario(String alumnos[]) {
		int numero = (int) (Math.random() * alumnos.length);
		return alumnos[numero];
	}

}
