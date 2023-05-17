//ejemplo numero aleatorio
public class Ejemplo09 {

	public static void main(String[] args) {

		//System.out.println("Numero aleatorio: "+Math.random());
		
		
		int x = (int)(Math.random()*6+1);
		System.out.println("Tirada de una moneda: ");
		
		int contador = 1;
		
		
		
		while (contador <= 10) {
			int numero = (int)(Math.random()*2+1);
			System.out.println(numero);
			contador++;
			
			
			
			if (numero == 1 ) {
				System.out.println("Cara");
			} else {
				System.out.println("Cruz");
			}
			
		}
		
		


	}

}
