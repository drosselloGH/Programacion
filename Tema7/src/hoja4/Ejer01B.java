package hoja4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejer01B extends JFrame {

	private JLabel lblImagen;
	private JButton btnPeli1;
	private JButton btnPeli2;
	private JButton btnPeli3;
	private JButton btnPeli4;

	public Ejer01B() {

		super("Fotogramas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);

		setLayout(new BorderLayout());

		// PANEL CENTRAL CON UNA IMAGEN DE UNA DE LAS PELÍCULAS.
		//debemos crear la etiqueta de la imagen antes de mostrar las fotos
		JPanel panelImagen = new JPanel();
		lblImagen = new JLabel(new ImageIcon("iconos/peliculas/blackrain.png"));
		panelImagen.add(lblImagen);

		// PANEL SUPERIOR CON LOS BOTONES CON LOS TÍTULOS DE LAS PELÍCULAS.

		JPanel panelBotones = new JPanel();

		btnPeli1 = new JButton("Black rain");
		btnPeli1.addActionListener(new ActionListener() {
			// al pulsar este boton, se mostrará una imagen de la pelicula
			@Override
			public void actionPerformed(ActionEvent e) {
				lblImagen.setIcon(new ImageIcon("iconos/peliculas/blackrain.png"));

			}
		});

		btnPeli2 = new JButton("El caso Winslow");
		btnPeli2.addActionListener(new ActionListener() {
			// al pulsar este boton, se mostrará una imagen de la pelicula
			@Override
			public void actionPerformed(ActionEvent e) {
				lblImagen.setIcon(new ImageIcon("iconos/peliculas/winslow.png"));

			}
		});

		btnPeli3 = new JButton("Asalto al distrito 13");
		btnPeli3.addActionListener(new ActionListener() {
			// al pulsar este boton, se mostrará una imagen de la pelicula
			@Override
			public void actionPerformed(ActionEvent e) {
				lblImagen.setIcon(new ImageIcon("iconos/peliculas/asalto.png"));

			}
		});

		btnPeli4 = new JButton("Blade runner");
		btnPeli4.addActionListener(new ActionListener() {
			// al pulsar este boton, se mostrará una imagen de la pelicula
			@Override
			public void actionPerformed(ActionEvent e) {
				lblImagen.setIcon(new ImageIcon("iconos/peliculas/bladerunner.png"));

			}
		});

		panelBotones.add(btnPeli1);
		panelBotones.add(btnPeli2);
		panelBotones.add(btnPeli3);
		panelBotones.add(btnPeli4);

		add(panelBotones, BorderLayout.NORTH);
		add(panelImagen, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer01B();
	}

}