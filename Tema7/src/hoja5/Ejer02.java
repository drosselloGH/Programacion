package hoja5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer02 extends JFrame {

	public Ejer02() {
		super("Letras - Colores");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblColor = new JLabel("Color");

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				int codigo = e.getKeyCode();

				// letra r
				if (codigo == 82) {
					lblColor.setText("ROJO");
					lblColor.setForeground(Color.red);
				} else if (codigo == 65) {
					lblColor.setText("AZUL");
					lblColor.setForeground(Color.blue);
				} else if (codigo == 86) {
					lblColor.setText("VERDE");
					lblColor.setForeground(Color.green);
				}

			}
		});
		
		add(lblColor);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer02();

	}
}
