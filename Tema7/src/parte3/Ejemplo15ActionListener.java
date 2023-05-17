package parte3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo15ActionListener extends JFrame {

	public Ejemplo15ActionListener() {
		super("Eventos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btnBoton = new JButton("Enviar");
		//añadimos un evento de escucha
		btnBoton.addActionListener(new ManejadorClics());

		add(btnBoton);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo15ActionListener();

	}
}
