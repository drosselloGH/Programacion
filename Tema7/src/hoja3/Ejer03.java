package hoja3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Ejer03 extends JFrame {

	public Ejer03() {
		super("Titulo");
		setSize(350, 150);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//PRIMERA BARRA
		JProgressBar prgCombustible = new JProgressBar(0, 100);
		prgCombustible.setPreferredSize(new Dimension(200, 25));
		prgCombustible.setForeground(Color.RED);
		prgCombustible.setValue(20);
		//mostramos el porcentaje
		prgCombustible.setStringPainted(true);
		
		JLabel lblCombustible = new JLabel("Combustible");
		
		//SEGUNDA BARRA
		JProgressBar prgPM1 = new JProgressBar(0, 100);
		prgPM1.setPreferredSize(new Dimension(200, 25));
		
		/*como poner un color personalizado:
		 * 
		 * new Color(color en decimal[numero1, numero2, numero3])
		 * 
		*/
		prgPM1.setForeground(Color.GREEN);
		prgPM1.setValue(75);
		prgPM1.setStringPainted(true);
		
		JLabel lblPM1 = new JLabel("Presión motor 1");
		
		//TERCERA BARRA
		JProgressBar prgPM2 = new JProgressBar(0, 100);
		prgPM2.setPreferredSize(new Dimension(200, 25));
		prgPM2.setForeground(Color.GREEN);
		prgPM2.setValue(75);
		prgPM2.setStringPainted(true);
		
		JLabel lblPM2 = new JLabel("Presión motor 2");
		
		add(prgCombustible);
		add(lblCombustible);
		
		add(prgPM1);
		add(lblPM1);
		
		add(prgPM2);
		add(lblPM2);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ejer03();

	}

}
