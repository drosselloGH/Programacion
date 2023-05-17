import java.util.Scanner;

// preguntar radio de un circulo
//mostrar el area
// si el usuario se equvoca de tipo de datos, informar

public class Ejemplo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero (en cm): ");

		if (sc.hasNextFloat()) {
			float radio = sc.nextFloat();
			System.out.println("Área: " + Math.PI * (radio * radio) + " cm");
			//formula área circulo

		} else {
			System.out.println("Tienes que escribir un número");
		}

	}

}
