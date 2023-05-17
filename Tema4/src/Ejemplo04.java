import java.util.Scanner;

//metodos que devuelven valores

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(doble(15));

		float resultado = doble(20);
		System.out.println(resultado);

		float resultado1 = triple(30);
		System.out.println(resultado1);

	}

	static float doble(float num) {
		return num * 2;
	}

	static float triple(float num) {
		return num * 3;
	}

}
