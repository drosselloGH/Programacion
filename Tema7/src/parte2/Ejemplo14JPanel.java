package parte2;


import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo14JPanel extends JFrame {

	public Ejemplo14JPanel() {
		super("Biblioteca");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new GridLayout(1, 2));
		
		//PANEL IZQUIERDO
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblTitulo = new JLabel("Titulo");
		JTextField txtTitulo = new JTextField(15);
		
		JLabel lblAutor = new JLabel("Autor");
		JTextField txtAutor = new JTextField(15);
		
		panelIzquierdo.add(lblTitulo);
		panelIzquierdo.add(txtTitulo);
		panelIzquierdo.add(lblAutor);
		panelIzquierdo.add(txtAutor);
		
		//PARTE DERECHA
		JButton btnAlta = new JButton("Alta");
		
		//VENTANA GLOBAL
		//esto se va a la derecha por el gridLayout
		add(panelIzquierdo);
		//esto se va a la derecha por el gridLayout
		add(btnAlta);
		
		
		
		

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo14JPanel();

	}
}
