//Se nos pide implementar un programa para ejecutarse en una máquina de cobro automático en un
//parking público.
//Al arrancar, se debe mostrar en pantalla el coste de la estancia (20 €). A continuación se le pedirá al
//usuario que vaya introduciendo cantidades (se supone que son billetes o monedas) hasta que llegue
//a los 20 €. Cada vez que el usuario escriba una cantidad, el programa le debe decir cuánto le falta
//para llegar a los 20 €.
//Cuando el total pagado por el usuario iguale los 20 €, el programa indicará que se ha abonado el
//importe justo y se despedirá con un mensaje de "Vuelva pronto" y terminará.
//Si el total pagado por el usuario sobrepasa los 20 €, el programa le informará de su cambio y
//también terminará.


//cuando la cantidad a abonar tiene un decimal < 5

package pract1;

import java.util.Scanner;

public class Act02c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float precioEstancia = 20; // este es el precio de la estancia
		float cantAbonada = 0; // cuanto dinero se ha abonado para pagar la estancia
		float resto = 0; // cuanto falta tras haber pagado la estancia

		System.out.println("El precio de la estancia es de " + precioEstancia + " euros");
		System.out.print("Cantidad introducida: ");
		cantAbonada = sc.nextFloat();
		resto = precioEstancia - cantAbonada; // el primer resto será el precio inicial - la cantidad abonada

		while (resto > 0) {
			System.out.println("Le quedan " + resto + " euros para abonar"); //usar el df.format()
			System.out.print("Cantidad introducida: ");
			cantAbonada = sc.nextFloat(); // usuario introduce la cantidad abonada
			resto = resto - cantAbonada; //el resto toma el valor del antiguo resto, menos la cantidad abonada
		}
		
		if (resto == 0) {
			System.out.println("Ha abonado el importe justo \n¡Vuelva pronto!");
		} else if (resto < 0) {
			double cantDevolver = 0 - resto;
			System.out.println("Tome su cambio: " + cantDevolver + " euros. \n¡Vuelva pronto!");

		}
		
		sc.close();
		
	}

}