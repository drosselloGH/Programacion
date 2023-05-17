package parte3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//podemos implementar directamente la interfaz de ActionListener
public class Ejemplo16ActionListener extends JFrame implements ActionListener {
	//debemos crear la variable global para que el metodo pueda acceder a ella
	private JLabel lblMensaje;

	public Ejemplo16ActionListener() {
		super("Eventos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btnBoton = new JButton("Enviar");

		// añadimos un evento de escucha, en este, caso: this
		btnBoton.addActionListener(this);
		lblMensaje = new JLabel("");

		add(btnBoton);
		add(lblMensaje);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo16ActionListener();

	}

	// traemos el metodo de ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		// setText("mensaje")
		lblMensaje.setText("Llamando");

	}
}
