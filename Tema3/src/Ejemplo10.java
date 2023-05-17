
public class Ejemplo10 {

	public static void main(String[] args) {

		// creamos un array bidimensional de 4 filas x 3 columnas
		double medidas[][] = new double[4][3];

		// posicion fila 0 columna 0
		medidas[0][0] = 8.5;

		// posicion fila 0 columna 1
		medidas[0][1] = 1020;

		// posicion fila 0 columna 2
		medidas[0][2] = 40;

		// posicion fila 1 columna 0
		medidas[1][0] = 14.2;
		
		//mostramos el valor de la posicion fila = 0 columna = 0
		System.out.println(medidas[0][0]);

		//mostramos el valor de la posicion fila = 0 columna = 1
		System.out.println(medidas[0][1]);

		//mostramos el valor de la posicion fila = 0 columna = 0
		System.out.println(medidas[0][0]);

	}

}
