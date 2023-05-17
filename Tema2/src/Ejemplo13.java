import java.util.Scanner;

//bucles anidados

//programa que pida el nombre y pellido de 5 usuarios, y despues de cada lectura, 
//mostrar 3 veces una linea con el nombre y apellido

public class Ejemplo13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Nombre");
			String nombre = sc.nextLine();

			System.out.println("Apellidos");
			String apellido = sc.nextLine();
			
			for (int j = 1; j <= 3; j++) {
				System.out.println("Nombre y apellidos " + nombre + " " + apellido + "\n");
			}

		}

	}

}
