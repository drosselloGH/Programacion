//12.- Escribe un programa para monitorizar la presión de un reactor químico. Se le preguntará al
//usuario un valor de presión (con decimales).
//Si la presión tiene un valor entre 1 y 1'7 atmósferas (ambos inclusive), se mostrará el mensaje
//"Presión normal". Si es mayor de 1'7 atm, se mostrará una alerta como "Presión excesiva, hay
//riesgo de explosión". Si, en cambio, la presión es menor de 1 atm, se indicará algo como "Presión
//baja, riesgo de vertido".
//El proceso se irá repitiendo mientras los valores no bajen de 0'4 atm ni pasen de 2'5 atm

package ejercicios_bucles_condicionales;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float presion;
		
		do {
			System.out.println("Indica el valor de presión (decimales)");
			presion = sc.nextFloat();
			if (presion < 0.4) {
				break;
			}else if(presion < 1) {
				System.out.println("Presión baja, riesgo de vertido");
			} else if ( presion >= 1 && presion <= 1.7) {
				System.out.println("Presión normal");
			} else if (presion > 1.7 && presion <= 2.5) {
				System.out.println("Presión excesiva, hay riesgo de explosión");
			} else {
				break;
			}
			
		} while(true);

	}

}
