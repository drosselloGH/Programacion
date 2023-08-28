package Tema5;

public class BusquedaBinaria {

	public static void main(String[] args) {
		
		int valores[] = { 5, 7, 10, 20, 35, 37, 40, 42 };
		int num = 10;
		
	}
	
	private static int buscar(int valores[], int num) {
		//posicion final
		int posFin = valores.length -1;
		
		//la posicion central del array
		int posMedio = (posFin + 0) / 2;
		
		//posicion inicial del array
		int posInicio = 0;
		
		while(posInicio <= posFin) {
			if(num > valores[posMedio]) {
				posInicio = posMedio +1;
			} else if(num < valores[posMedio]) {
				posFin = posMedio -1;
			} else {
				return posMedio;
			}
			
			//la posicion central es la suma de 
			//a posicion inicial y la final entre 2
			posMedio = (posInicio + posFin) / 2;
			
		}
		
		//no encontrado
		return -1;
		
	}
	
}
