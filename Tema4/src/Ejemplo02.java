import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Como te llamas?");
		String nombre = sc.nextLine();
		//pasamos la variable nombre a la llamada del metodo
		saludar(nombre);
		System.out.println("Hasta otra");

	}

	// los parenetesis indican qué datos manejan
	static void saludar(String nombre) {
		System.out.println("Hola, " + nombre + ", como estas?");
	}

}
