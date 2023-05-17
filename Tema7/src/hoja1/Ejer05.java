package hoja1;

import javax.swing.JOptionPane;

public class Ejer05 {

	public static void main(String[] args) {
		String[] servidores = { "Apache", "IIS", "Nginx", "NodeJS" };
		int eleccion = JOptionPane.showOptionDialog(null, "Elección de servidor web",
				"¿Qué servidor web desea para su hosting?", 0, JOptionPane.INFORMATION_MESSAGE, null, servidores,
				"ISS");

		if (eleccion == -1) {
			System.out.println("No ha elegido ningún servidor");
		} else {
			System.out.println("La elección de servidor web para su hosting es: " + servidores[eleccion]);
		}

	}

}
