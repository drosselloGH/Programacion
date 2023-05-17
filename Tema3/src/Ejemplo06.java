//Busqueda del minimo en un array

public class Ejemplo06 {

	public static void main(String[] args) {

		int edades[] = {40, 35, 55, 30, 32, 28, 30};
		
		//apunta a la posicion del menor elemento encontrado hasta el momento
		int posMin = 0;
		
		for (int i = 0; i < edades.length; i++) {
			if(edades[i] < edades[posMin]) {
				posMin = i;
			}
		}
		System.out.println("el minimo se encuentra en la posicion "+posMin+" y su valor es "+edades[posMin]);

	}

}
