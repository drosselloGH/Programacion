
//ordenar un array bidimensional
//ordenar una tabla por precio

public class Ejemplo15 {

	public static void main(String[] args) {
		String precios[][] = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		int posMin;
		// necesitamos dos variables auxiliares para intercambiar el nombre y el precio
		// a la vez
		String aux0;
		String aux1;

		for (int i = 0; i < precios.length - 1; i++) {

			posMin = i;
			// recorremos las posiciones desde i+1 hasta el final
			// a ver si encontramos un precio mas bajo
			for (int j = i + 1; j < precios.length; j++) {
				if (Float.parseFloat(precios[j][1]) < Float.parseFloat(precios[posMin][1])) {
					posMin = j;
				}
			}
			
			//ahora en la fila posMin esta el precio mas bajo desde i hasta el final del array
			
			//intercambiamos la fila i con la fila posMin
			aux0 = precios[i][0];
			aux1 = precios[i][1];
			
			precios[i][0] = precios[posMin][0];
			precios[i][1] = precios[posMin][1];
			
			precios[posMin][0] = aux0;
			precios[posMin][1] = aux1;

		}
		//mostramos la tabla ya ordenada
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i][0]+"\t"+precios[i][1]);
		}

	}

}
