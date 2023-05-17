import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		Carta carta1 = new Carta((int) (Math.random() * 13 + 1), (int) (Math.random() * 3));
		Carta carta2 = new Carta((int) (Math.random() * 13 + 1), (int) (Math.random() * 3));
		
		System.out.println(carta1.toString());
		System.out.println(carta2.toString());

	}

}
