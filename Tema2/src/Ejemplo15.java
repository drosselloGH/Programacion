import java.util.Scanner;

public class Ejemplo15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeros 20 multiplos de 10");
		
		for(int i = 1; i <= 20; i++) {
			
			if (10*i == 50) {
				continue;
			}
			
			System.out.println(10*i);
		}
		
	}

}
