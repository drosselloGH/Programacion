
public class Ejemplo05 {

	public static void main(String[] args) {
		int edades[] = { 30, 40, 45, 20, 62, 70 };
		
		buscar(edades, 40);

	}
	
	static void buscar(int edades[], int edad) {		
		for (int i = 0; i < edades.length; i++) {
			if(edad == edades[i]) {
				System.out.println("Posicion: "+(i+1));
				//el metodo termina y la ejecucion vuelve al lugar de donde habia sido llamado
				return;
			} else if(edad != edades[i] && i == edades.length -1) {
				System.out.println("-1");
			}
		}
		
	}

}
