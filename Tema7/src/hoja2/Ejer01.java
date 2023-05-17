package hoja2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JSlider;

public class Ejer01 extends JFrame {

	public Ejer01() {
		super("Velocidad de crucero");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JSlider sldVelocidad = new JSlider(JSlider.HORIZONTAL, 10, 120, 90);
		
		sldVelocidad.setPaintLabels(true);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setMinorTickSpacing(5);
		sldVelocidad.setMajorTickSpacing(20);
		
		sldVelocidad.setPreferredSize(new Dimension(275, 55));
		//dimensiones de la barra
		
		add(sldVelocidad);
		
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer01();
	}

}
