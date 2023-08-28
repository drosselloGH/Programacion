package Tema5;

public class BusquedaSecuencial {

	/*BUSQUEDA EN TABLA NO ORDENADA*/
	
	public static void main(String[] args) {
		
		int t[] = {2, 5, 1, 4, 3};
		
		//indice para recorrer la tabla
		int indiceBusqueda = 0;
		
		int numBuscar = 1;
		
		//mientras no se haya recorrido la tabla entera y mientras el valor del numero en la posicion indicada no sea el del valor buscado
		while(indiceBusqueda < t.length && t[indiceBusqueda] != numBuscar) {
			indiceBusqueda++;
		}
		
		//se sale del bucle si se ha encontrado la posicion o no
		if(indiceBusqueda < t.length) {
			System.out.println("Encontrado");
		} else {
			System.out.println("No encontrado");
		}
		
	}
	
}
