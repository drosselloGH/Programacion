
public class Ejemplo04 {

	public static void main(String[] args) {

		//ejemplo desbordamiento
		
		byte unidades = 127;
		System.out.println(unidades);
		
		unidades = (byte) (unidades + 2);
		
		System.out.println(unidades);
		
		//ejemplo perdida de precision
		
		float medida = 4.98787328652F;
		System.out.println(medida);
		
	}

}
