package Tema8Instrumentos;

import java.util.Iterator;

import Tema8Instrumentos.Instrumento.Nota;

public class Main {

	public static void main(String[] args) {

		Piano p1 = new Piano();

		// primero creamos la cancion
		Nota cancion[] = { Nota.RE, Nota.RE, Nota.SOL, Nota.SOL, Nota.LA, Nota.LA, Nota.LA, Nota.LA, Nota.LA, Nota.LA,
				Nota.LA, };

		// añadimos la cancion al piano
		for (Nota n : cancion) {
			p1.add(n);
		}

		p1.interpretar();

	}

}
