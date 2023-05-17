package hoja2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejer04 extends JFrame {

	public Ejer04() {
		super("Suscripción");
		setSize(275, 350);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel lblNombre = new JLabel("Nombre");
		//cantida de caracteres esperados
		JTextField txtNombre = new JTextField(20);
		
		JLabel lblEmail = new JLabel("Email");
		JTextField txtEmail = new JTextField(20);
		
		JLabel lblMotivo = new JLabel("Motivo por el que te suscribes");
		JTextArea txtMotivo = new JTextArea();
		
		JScrollPane srcPane = new JScrollPane(txtMotivo);
		srcPane.setPreferredSize(new Dimension(230, 100));
		
		JCheckBox chkSpam = new JCheckBox("Recibir información por correo");
		
		JButton btnEnviar = new JButton("Enviar");
		
		
		add(lblNombre);
		add(txtNombre);
		add(lblEmail);
		add(txtEmail);
		add(lblMotivo);
		add(srcPane);
		add(chkSpam);
		add(btnEnviar);
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ejer04();

	}

}
