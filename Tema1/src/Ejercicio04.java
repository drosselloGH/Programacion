import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nombre: ");
		String nombre = sc.next();

		System.out.print("Nota primera evaluacion: ");
		int nota1 = sc.nextInt();

		System.out.print("Nota segunda evaluacion: ");
		int nota2 = sc.nextInt();

		System.out.print("Nota tercera evaluacion: ");
		int nota3 = sc.nextInt();

		// sumamos todas las notas
		int sumaNotas = nota1 + nota2 + nota3;

		// creamos la variable de la nota media
		int mediaNotas = sumaNotas / 3;

		System.out.print("Nota media: " + mediaNotas);

	}

}