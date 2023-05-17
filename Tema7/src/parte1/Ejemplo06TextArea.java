package parte1;


import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo06TextArea extends JFrame {

	public Ejemplo06TextArea() {
		super("Ejemplo de textara");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		// hace que se ejecute como en un S.O nativo
		// podemos introcudirle una cadena (ruta del look and feel)
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			// cuando se realiza un camino de tema, redibuja la ventana
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Se ha intentado cambiar el LookAndFeel de la aplicación");

			e.printStackTrace();
		}

		JLabel lblComentarios = new JLabel("Comentarios");
		JTextArea txtComentarios = new JTextArea();

		// esto permite crear un panel de Scroll que este en el apartado Comentarios
		JScrollPane scrPanel = new JScrollPane(txtComentarios);
		scrPanel.setPreferredSize(new Dimension(380, 200));
		JButton btnEnviar = new JButton("Enviar");

		add(lblComentarios);
		// hay que añadirlo al programa
		add(scrPanel);
		add(btnEnviar);

		setVisible(true);
	}

	public static void main(String[] args) {

		new Ejemplo06TextArea();

	}

}
