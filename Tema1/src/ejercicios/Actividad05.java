package ejercicios;
import java.util.Scanner;

public class Actividad05 {

    public static void main(String[] args) {
        // Crea un programa que pida el nombre de un producto en venta, su precio y el
        // descuento que se le debe hacer. Mostrará todos los datos junto al precio
        // rebajado

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Dime el nombre del producto?");
        String producto = entrada.nextLine();
       
        System.out.println("¿Cuál es su precio?");
        float precio = entrada.nextFloat();
       
        System.out.println("¿Qué descuento le quieres hacer?");
        float descuento = entrada.nextFloat();
        float resultado = precio * ((100-descuento)/100);
       
        System.out.println("El precio del producto "+ producto+" es "+precio+" .");
        System.out.println("Con el descuento del "+descuento+"%, el precio final es "+ resultado + ".");
               

    }

}
