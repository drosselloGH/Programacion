package ejemplo08ConfirmDialog;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejer02InputDialog extends JFrame {

//	public Ejer02InputDialog() {
//		setSize(400, 300);
//		
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		
//		/*
//		 * 1. Objeto contenedor
//		 * 2. Mensaje a mostrar
//		 * 3. Titulo ventana
//		 * 4. Icono
//		*/
//		String respuesta = JOptionPane.showInputDialog(null, "Escribe tu DNI", "Confirmación de indentidad", JOptionPane.QUESTION_MESSAGE);	
//		
//	}

	public static void main(String[] args) {

//		new Ejer02InputDialog();
		String respuesta = JOptionPane.showInputDialog(null, "Escribe tu DNI", "Confirmación de indentidad",
				JOptionPane.QUESTION_MESSAGE);
		if (respuesta == null) {
			System.out.println("Escribe tu DNI");
		} else if (respuesta.equals("")) {
			System.out.println("No lo dejes en blanco");
		} else {
			System.out.println("Tu DNI es: " + respuesta);
		}

		String clave = JOptionPane.showInputDialog(null, "Escriba su clave de seguridad", "Clave de seguridad",
				JOptionPane.WARNING_MESSAGE);
		
		System.out.println("Tu clave es "+clave);
	}

}
