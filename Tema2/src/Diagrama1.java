import java.util.Scanner;

public class Diagrama1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//int contador = 1;
		int sumaTotal = 0;
		
		for (int contador = 1; contador <= 20; contador++) {
			System.out.println(contador);
			
			sumaTotal = sumaTotal + contador;
			
			if (contador == 20) {
				System.out.println("Suma total: " + sumaTotal);
			}
		}
		
	}

}
