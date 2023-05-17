package parte2;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo13GridLayout extends JFrame {

	public Ejemplo13GridLayout() {
		super("Stream Deack");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//filas, columnas, separacion columna, separacion fila
		setLayout(new GridLayout(2, 4, 5, 5));
		
		JButton btnMute = new JButton("Mute");
		JButton btnPause = new JButton("Pausa");
		JButton btnCambioPlano = new JButton("Cambio Plano");
		JButton btnRefresh = new JButton("Refresh");
		JButton btnCamara = new JButton("Cámara");
		JButton btnCerrar = new JButton("Cerrar");
		JButton btnIntro = new JButton("Intro");
		JButton btnOutro = new JButton("Outro");
		
		add(btnMute);
		add(btnPause);
		add(btnCambioPlano);
		add(btnRefresh);
		add(btnCamara);
		add(btnCerrar);
		add(btnIntro);
		add(btnOutro);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo13GridLayout();

	}
}
