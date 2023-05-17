
public class Ejemplo02 {

	public static void main(String[] args) {

		// creamos un array de 3 posiciones
		String[] equipos = new String[3];
		
		//asiganmos un valor a cada uno de las posiciones
		equipos[0] = "Real Madrid";
		equipos[1] = "Real Sociedad";
		equipos[2] = "FC Barcelona";
		
		System.out.println(equipos[0]);
		System.out.println(equipos[1]);
		System.out.println(equipos[2]);
		
		//asignamos a la posicion 0 un nuevo valor
		equipos[0] = "Atletico de Madrid";
		System.out.println(equipos[0]);


	}

}
