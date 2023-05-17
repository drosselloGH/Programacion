import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// array para guardar los equipos favoritos
		String[] equipos = new String[3];
		System.out.println("Escribe tus equipos favoritos");
		for (int i = 0; i < equipos.length; i++) {
			System.out.println("Qué equipo te gusta?");
			equipos[i] = sc.nextLine();
		}
		System.out.println("Tus " + equipos.length + " equipos favoritos son: ");
		for (int i = 0; i < equipos.length; i++) {
			System.out.println(equipos[i]);
		}

	}

}
