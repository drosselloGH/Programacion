package parte3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo19ClasesInternasAnonimas extends JFrame {

	public Ejemplo19ClasesInternasAnonimas() {
		super("Botones");
		setSize(200, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btnRojo = new JButton("Rojo");

		JButton btnAzul = new JButton("Azul");
//		btn2.addActionListener();

		JLabel lblMensaje = new JLabel("");

		//son anonimas porque no les ponemos nombre
		
		// indicamos que se encarga una nueva ActionListener
		// creamos una nueva clase que implementa ActionListener (clase interna)
		btnRojo.addActionListener(new ActionListener() {
			//este codigo esta asociado al boton Rojo
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText("Has clicado Rojo");

			}
		});

		
		btnAzul.addActionListener(new ActionListener() {
			//este codigo está asociado al boton Azul
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText("Has pulsado Azul");

			}
		});

		add(btnRojo);
		add(btnAzul);
		add(lblMensaje);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo19ClasesInternasAnonimas();

	}
}
