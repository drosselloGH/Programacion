import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Ejemplo11Progressbar extends JFrame {

	public Ejemplo11Progressbar() {
		super("Peso en el ascensor");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// El peso de un ascensos no debe superar los 150kg
		JProgressBar prgPeso = new JProgressBar(0, 150);
		prgPeso.setPreferredSize(new Dimension(300, 50));

		// para colorear la barra se usa Foreground, Background es el resto de la barra
		prgPeso.setForeground(Color.GREEN);
		prgPeso.setBackground(Color.WHITE);

		add(prgPeso);

		setVisible(true);

		// al mostrarse el indicador marca 50kg y va aumentando hasta llenarse la barra
		for (int i = 50; i <= 150; i++) {
			prgPeso.setValue(i);
			try {
				//sube un punto cada 200 milisegundos
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("Error al pausar la ejecución");
			}
		}

	}

	public static void main(String[] args) {

		new Ejemplo11Progressbar();

	}
}
