package ejemplo08ConfirmDialog;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejer031 extends JFrame {

	public Ejer031() {
		setSize(400, 300);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		/*
		 * 1. Objeto contenedor 
		 * 2. Mensaje a mostrar 
		 * 3. Titulo ventana 
		 * 4. Icono
		 */
		JOptionPane.showMessageDialog(null, "Se ha detectado un escaneo de red desde la IP 192.168.1.51", "Alerta de seguridad", JOptionPane.WARNING_MESSAGE);

	}

	public static void main(String[] args) {

		new Ejer031();

	}

}
