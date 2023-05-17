package ejercicios;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cual es el nombre del producto?");
        String nombre = entrada.nextLine();
        System.out.println("¿Cual es el precio de este producto?");
        int precio = entrada.nextInt();
        System.out.println("¿Cual es la cantidad de ventas que ha tenido este producto?");
        int cantidad = entrada.nextInt();
       
        System.out.println("Este producto ha vendido un total de " + precio * cantidad + "€.");
       
    }

}