package ejemplo08ConfirmDialog;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejer01ConfirmDialog extends JFrame {

	public Ejer01ConfirmDialog() {
		// nombre de la ventana
		super("Confirmación de formateo");

		// tamaño
		setSize(400, 300);

		// hacemos que se cierre el programa al cerrar la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		/*
		 * 1. Objeto contenedor (posicion de presentacion [null == centro pantalla])
		 * 2. Mensaje para el usuario
		 * 3. Titulo ventana
		 * 4. Botones (YES_NO_CANCEL_OPTION, YES_NO_OPTION, YES_OPTION... (JOptionPane))
		 * 5. Icono (WARNING_MESSAGE, ERROR_MESSAGE...) 
		 * */
		int formatear = JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?", "Confirmación de formateo",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
	}

	public static void main(String[] args) {
//		new Ejer01ConfirmDialog();
		int formatear = JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?", "Confirmación de formateo",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		//showDialog devuelve un entero, y vemos su valor
		System.out.println("Valor devuelto formatear: "+formatear);
		
		//en este caso, OK es 0, y NO es 2
		if(formatear == JOptionPane.OK_OPTION) {
			System.out.println("Formateando...");
		} else {
			System.out.println("Formateo cancelado");
		}
	}

}
