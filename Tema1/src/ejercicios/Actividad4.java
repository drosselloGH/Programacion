package ejercicios;
import java.util.Scanner;

public class Actividad4 {
    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Programa para calcular la media");
       
        System.out.println("Nombre del alumno");
        String nombre = entrada.nextLine();
       
        System.out.print("Introduzca la nota de la 1a Avaluación: ");
        float valor1 = entrada.nextFloat();
       
        System.out.print("Introduzca la nota de la 2a Avaluación: ");
        float valor2 = entrada.nextFloat();
       
        System.out.print("Introduzca la nota de la 3a Avaluación: ");
        float valor3 = entrada.nextFloat();
       
        System.out.print(nombre + ", su nota media és: " + (valor1 + valor2 + valor3)/(3));
       
    
    
    }

}