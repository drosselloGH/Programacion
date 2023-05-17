package ejercicios;
import java.util.Scanner;

public class Act03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba dos números.");
       
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
       
        int resto = num1 % num2;
        int cociente = num1 / num2;
        System.out.println("El resto de la división es: "+ resto + ".");
        System.out.println("El cociente de la division es: "+ cociente + ".");
       
    }

}
