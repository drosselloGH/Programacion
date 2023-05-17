import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe el precio de un videojuego: ");
		double precio = sc.nextDouble();
		
		//si precio es mayor que 100, escribir "muy caro"
		
		if (precio > 80) {
			//si el precio es mayor que 100
			
			System.out.println("Muy caro");
			System.out.println("No te pases");
			
		} else if (precio == 80){
			//si el precio no pasa de 100
			
			System.out.println("Más justo que el pelo de una gamba");
			
		} else {
			
			System.out.println("Es baratillo");
			System.out.println("Ponme otro, doble");
			
		}
		
		System.out.println("Fin");
		
	}

}
