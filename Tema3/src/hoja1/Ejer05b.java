//5.- Crea un array llamado notas con cinco posiciones y ve asignando a cada una de ellas el valor de
//un examen que hayas hecho este curso (no sólo de programación). Haz que después se muestren
//todos los valores mediante un bucle while.

package hoja1;

public class Ejer05b {

	public static void main(String[] args) {
		double[] notas = { 8.5, 7.55, 7.3 };
		System.out.println("****MIS NOTAS****");
		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

	}

}
