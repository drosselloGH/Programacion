import java.util.Arrays;

//ordenar un array bidimensional
//ordenar una tabla por nombre del articulo   (compare to)

public class Ejemplo15b {

	public static void main(String[] args) {
		String precios[][] = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		int primera;
		
		String aux0, aux1;
		
		for (int i = 0; i < precios.length -1; i++) {
			primera = i;
			for (int j = i+1; j < precios.length; j++) {
				//guardamos el resultado de la comparacion
				int resultado = precios[j][0].compareTo(precios[primera][0]);
				//si el resultado es menor que 0, 
				//indica que no estan ordenadas alfabeticamente
				if(resultado < 0) {
					primera = j;
				}
				
				//manera alternativa
//				for (int j = i+1; j < precios.length; j++) {
//					String nombreActual = precios[j][0].toUpperCase();
//					String nombrePosMin = precios[primera][0].toUpperCase();
//					//guardamos el resultado de la comparacion
//					int resultado = nombreActual.compareTo(nombrePosMin);
//					//si el resultado es menor que 0, 
//					//indica que no estan ordenadas alfabeticamente
//					if(resultado < 0) {
//						primera = j;
//					}
				
			}
			
			
			
			//proceso de ordenación
			
			aux0 = precios[i][0];
			aux1 = precios[i][1];
			
			precios[i][0] = precios[primera][0];
			precios[i][1] = precios[primera][1];
			
			precios[primera][0] = aux0;
			precios[primera][1] = aux1;
		}
		
		for (int i = 0; i < precios.length; i++) {
			System.out.println(Arrays.toString(precios[i]));
		}

	}

}
