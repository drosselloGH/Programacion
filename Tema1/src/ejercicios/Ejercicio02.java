package ejercicios;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para el resto");
       
        System.out.print("Eliga el primero número: ");
        int num1 = entrada.nextInt();
       
        System.out.print("Eliga el segundo número: ");
        int num2 = entrada.nextInt();

        System.out.println("El resto es: " + num1 % num2);
    }

}



