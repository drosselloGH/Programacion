package Tema5;

import java.util.Arrays;

public class Ejer6 {

	public static void main(String[] args) {
		
		//debe estar ordenada
		int apuestaGanadora[] = new int[6];
		
		//rellenamos el array
		apuestaGanadora = rellenar(apuestaGanadora);
		
		//ordenamos la apuesta ganadora
		Arrays.sort(apuestaGanadora);

		System.out.println("Apuesta ganadora: "+Arrays.toString(apuestaGanadora));
		
		int apuestaLoteria[] = new int [6];
		
		//rellenamos el array
		apuestaLoteria = rellenar(apuestaLoteria);
		
		System.out.println("Apuesta loteria: "+Arrays.toString(apuestaLoteria));
		
		System.out.println("Numeros acertados: "+comprobarNumeros(apuestaLoteria, apuestaGanadora));
		
	}
	
	/**
	 * 
	 * @param tabla vacía
	 * @return tabla rellena de numeros
	 */
	private static int[] rellenar(int tabla[]) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*49 +1);
		}
		
		return tabla;
	}
	
	/**
	 * 
	 * @param apuesta desordenada
	 * @param ganadora ordenada
	 * @return cantidad de numeros acertados
	 */
	private static int comprobarNumeros(int apuesta[], int ganadora[]) {
		int cantAciertos = 0;
		
		for(int num : ganadora) {
			if(buscar(apuesta, num) >= 0) {
				cantAciertos++;
			}
		}
		
		return cantAciertos;
		
	}
	
	/**
	 * 
	 * @param valores 
	 * @param num
	 * @return posicion del numero que se busca
	 */
	private static int buscar(int valores[], int num) {
		
		int posFin = valores.length -1;
		
		int posMedio = (posFin +0) / 2;
		
		int posInicio = 0;
		
		while(posInicio <= posFin) {
			
			if(num > valores[posMedio]) {
				posInicio = posMedio +1;
			} else if(num < valores[posMedio]) {
				posFin = posMedio -1;
			} else {
				return posMedio;
			}
			
			posMedio = (posInicio + posFin) / 2;
			
		}
		
		//no encontrado
		return -1;
		
	}
	
}
