import java.util.Scanner;

public class Prueba {

	public static final int NUMERO = (int)(Math.random()*10+1);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean numEncontrado = false;
		
		do {
			System.out.println("En qué numero estoy pensando?");
			int num = sc.nextInt();
			if(num > NUMERO) {
				System.out.println("Más pequeño\n");
				numEncontrado = false;
			} else if(num < NUMERO) {
				System.out.println("Más grande\n");
				numEncontrado = false;
			} else if(num == NUMERO) {
				System.out.println("¡Has acertado!");
				break;
			}
			
		} while (numEncontrado == false);
		
		
		
	}
	
	
	
}
