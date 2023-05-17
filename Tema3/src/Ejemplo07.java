//Busqueda del maximo en un array

public class Ejemplo07 {

	public static void main(String[] args) {

		int edades[] = {40, 35, 55, 30, 32, 28, 30};
		
		//apunta a la posicion del mayor elemento encontrado hasta el momento
		int posMax = 0;
		
		for (int i = 0; i < edades.length; i++) {
			if(edades[i] > edades[posMax]) {
				posMax = i;
			}
		}
		System.out.println("el maximo se encuentra en la posicion "+posMax+" y su valor es "+edades[posMax]);

	}

}
