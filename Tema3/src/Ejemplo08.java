
public class Ejemplo08 {

	public static void main(String[] args) {

		long tiempoInicio = System.currentTimeMillis();
		
		//proceso cuyo tiempo quiero medir
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		//El tiempo transcurrido lo saco de restar el instante actual del instante inicial
		long  tiempoActual = System.currentTimeMillis();
		
		System.out.println("Instante inicial "+tiempoInicio);
		System.out.println("Instante final "+ tiempoActual);
		
		System.out.println("Tiempo transcurrido: "+(tiempoActual - tiempoInicio)/1000.0+" ms");
		

	}

}
