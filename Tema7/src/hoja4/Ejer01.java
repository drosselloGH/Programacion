package hoja4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejer01 extends JFrame implements ActionListener {

	private JLabel lblImagen;
	private JButton btnPeli1 ;
	private JButton btnPeli2;
	private JButton btnPeli3;
	private JButton btnPeli4;

	public Ejer01() {

		super("Fotogramas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);

		setLayout(new BorderLayout());

		// PANEL SUPERIOR CON LOS BOTONES CON LOS TÍTULOS DE LAS PELÍCULAS.

		JPanel panelBotones = new JPanel();
		
		btnPeli1 = new JButton("Black rain");
		btnPeli1.addActionListener(this);
		
		btnPeli2 = new JButton("El caso Winslow");
		btnPeli2.addActionListener(this);
		
		btnPeli3 = new JButton("Asalto al distrito 13");
		btnPeli3.addActionListener(this);
		
		btnPeli4 = new JButton("Blade runner");
		btnPeli4.addActionListener(this);

		panelBotones.add(btnPeli1);
		panelBotones.add(btnPeli2);
		panelBotones.add(btnPeli3);
		panelBotones.add(btnPeli4);

		// PANEL CENTRAL CON UNA IMAGEN DE UNA DE LAS PELÍCULAS.

		JPanel panelImagen = new JPanel();
		lblImagen = new JLabel(
				new ImageIcon("iconos/blackrain.jpg"));
		panelImagen.add(lblImagen);

		add(panelBotones, BorderLayout.NORTH);
		add(panelImagen, BorderLayout.CENTER);

		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnPeli1) {
			lblImagen.setIcon(new ImageIcon("iconos/blackrain.jpg"));
		} else if (e.getSource() == btnPeli2) {
			lblImagen.setIcon(new ImageIcon("iconos/winslow.jpg"));
		} else if (e.getSource() == btnPeli3) {
			lblImagen.setIcon(new ImageIcon("iconos/asalto.jpg"));
		} else if (e.getSource() == btnPeli4) {
			lblImagen.setIcon(new ImageIcon("iconos/bladerunner.jpg"));
		}

	}

	public static void main(String[] args) {
		new Ejer01();
	}

}