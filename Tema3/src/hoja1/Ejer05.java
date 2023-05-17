//5.- Crea un array llamado notas con cinco posiciones y ve asignando a cada una de ellas el valor de
//un examen que hayas hecho este curso (no sólo de programación). Haz que después se muestren
//todos los valores mediante un bucle while.

package hoja1;

public class Ejer05 {

	public static void main(String[] args) {
		double[] notas = new double[3];

		notas[0] = 8.5;
		notas[1] = 7.55;
		notas[2] = 7.3;

		int posicion = 0;

		System.out.println("****MIS NOTAS****");

		while (posicion < notas.length) {
			System.out.println(notas[posicion]);
			posicion++;
		}

	}

}
