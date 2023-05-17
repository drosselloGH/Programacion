//Se te ha encargado preparar un programa que gestiona la lista de verificación previa al lanzamiento
//de un cohete espacial. La aplicación debe comprobar que:
//• Hay al menos 50 de combustible.
//• Las baterías están cargadas al 95% o más.
//• Hay comida para 5 días o más.
//• Hay al menos 50 litros de agua.
//Nada más arrancar la aplicación, se preguntará al usuario los valores de estos cuatro parámetros. Si
//son correctos (superan las cifras anteriores), se mostrará un resumen del inventario y se procederá al
//lanzamiento:
//Si alguna cantidad no es suficiente, se informará al usuario y se repetirá el proceso las veces que sea
//necesario:

package prac2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cargaBateria = 0, comidaPorDias = 0, litrosAgua = 0, combustible = 0;

		// asumimos que todo está mal
		boolean todoMal = true;
		
		System.out.println("*** Misión Espacial Tripulada ***\n");

		while (todoMal) {
			System.out.println("Checklist previo al lanzamiento");
			System.out.println("=====================================");
			System.out.print("Capacidad combustible (en m3): ");
			combustible = sc.nextInt();

			System.out.print("Carga baterias (en %): ");
			cargaBateria = sc.nextInt();

			System.out.print("Cantidad de comida (en días): ");
			comidaPorDias = sc.nextInt();

			System.out.print("Cantidad agua (en litros): ");
			litrosAgua = sc.nextInt();
			
			System.out.println("\nAnalizando información...");
			
			//condicion para efectuar el despegue
			if (combustible >= 50 && cargaBateria >= 95 && comidaPorDias >= 5 && litrosAgua >= 50) {
				todoMal = false;
				System.out.println("\n=====================================");
			} else {
				System.out.println("Se han encontrado incidencias. Vuelva a revisar el checklist.\n");
				todoMal = true;
			}
			
		}
		System.out.println("Los parámetros de la misión son válidos:");
		System.out.println("Combustible: "+combustible+" m3.");
		System.out.println("Baterías: "+cargaBateria+" %.");
		System.out.println("Comida: "+comidaPorDias+" días.");
		System.out.println("Agua: "+litrosAgua+" litros");

		System.out.println("\nDespegue permitido.");

	}

}
