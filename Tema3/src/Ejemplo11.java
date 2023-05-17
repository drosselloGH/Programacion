import java.util.Arrays;

public class Ejemplo11 {

	public static void main(String[] args) {
		// creamos un array bidimensional de 4 filas x 3 columnas
		double medidas[][] = {
				//cada elemento del array es un valor del array "medidas"
				{8.5, 1020, 40},
				{14.2, 1021, 35},
				{11, 1022, 45},
				{7, 1023, 50}
		};
		
		//mostramos algunas posiciones
		System.out.println(medidas[0][0]);
		System.out.println(medidas[0][1]);
		System.out.println(medidas[0][2]);
		System.out.println(medidas[0][0]);
		System.out.println(medidas[3][0]);
		System.out.println(medidas[1][2]);
		
		//mostramos filas enteras
		System.out.println(Arrays.toString(medidas[0]));
		System.out.println(Arrays.toString(medidas[1]));
		System.out.println(Arrays.toString(medidas[2]));
		System.out.println(Arrays.toString(medidas[3]));

	}

}
