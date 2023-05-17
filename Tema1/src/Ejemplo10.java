
public class Ejemplo10 {

	public static void main(String[] args) {

		//valores constantes
		
		final float PI = 3.1416F;
		final int NUM_EQUIPOS = 20; //si no estuviese inicializada, la podriamos reasignar
		final double DISTANCIA_SONFERRER_PALMA = 19.25;

		System.out.print(NUM_EQUIPOS);

		//vemos que no podemos reasignar un valor a una variable final ya asignada
		NUM_EQUIPOS = 22;
		
	}

}
