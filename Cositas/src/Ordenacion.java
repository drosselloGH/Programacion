
public class Ordenacion {

	public static final String ANSI_CYAN = "\u001B[36m";
	
	public static void main(String[] args) {
		
		int numeros [] = {2, 1, 5, 3, 6, 4, 8, 10, 7, 9};
		
		ordenarYMostrar(numeros);
		
	}
	
	public static void ordenarYMostrar(int numeros[]) {
		int posMin, aux;
		for (int i = 0; i < numeros.length; i++) {
			posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if(numeros[j] < numeros[posMin]) {
					posMin= j;
				}
			}
			
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;
			
		}
		
		System.out.println();
		
		for(int numero : numeros) {
			System.out.print(ANSI_CYAN +""+numero+"\t");
		}
	}
	
}
