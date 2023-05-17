package ejemplo09SwingAvanzado;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Jslider extends JFrame {

	public Jslider() {
		super("Volúmen");
		setSize(200, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JSlider sldVolumen = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		//orientacion, minimo, maximo, marca 50 por defecto
		
		sldVolumen.setPaintLabels(true);
		//mostrar los numeros
		
		sldVolumen.setPaintTicks(true);
		//mostrar la escala
		
		sldVolumen.setMinorTickSpacing(5);
		//cada raya pequeña son 5 unidades
		
		sldVolumen.setMajorTickSpacing(25);
		//cada raya grande son 25 unidades
		
		sldVolumen.setPreferredSize(new Dimension(55, 250));
		
		add(sldVolumen);
		
		setVisible(true);
	}

	public static void main(String[] args) {

		new Jslider();

	}

}
