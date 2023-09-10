package Tema8Instrumentos;

import java.lang.reflect.Array;
import java.util.Arrays;

abstract class Instrumento {

	//protegido para que sea visible a las subclases
	protected Nota melodia[];

	enum Nota {
		DO, RE, MI, FA, SOL, LA, SI
	};

	public Instrumento() {
		melodia = new Nota[0];
	}

	public void add(Nota n) {
		//hacemos el array un punto mas grande
		melodia = Arrays.copyOf(melodia, melodia.length +1);
		//insertamos la nota en el array
		melodia[melodia.length -1] = n;
	}

	public abstract void interpretar();

}
