package hoja2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Ejer02 extends JFrame {

	public Ejer02() {
		super("Termostato");
		setSize(250, 270);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JSlider sldTemperatura = new JSlider(JSlider.VERTICAL, 0, 25, 17);
		
		//mostramos los numeros
		sldTemperatura.setPaintLabels(true);
		//mostramos la escala
		sldTemperatura.setPaintTicks(true);
		sldTemperatura.setMinorTickSpacing(1);
		sldTemperatura.setMajorTickSpacing(5);
		
		sldTemperatura.setPreferredSize(new Dimension(55, 200));
		
		JLabel lblTemperatura = new JLabel("Temperatura(*C)");
		
		add(sldTemperatura);
		add(lblTemperatura);
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ejer02();

	}

}
