package hoja6;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Ejer02 extends JFrame {

	public Ejer02() {
		super("Salpicadero");
		setSize(550, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		/*PANEL IZQUIERDO*/
		
		JPanel panel1 = new JPanel();
		
		JLabel lblVelocidad = new JLabel("Velocidad");
		JSlider sldVelocidad = new JSlider(0, 180, 30);
		sldVelocidad.setMajorTickSpacing(30);
		sldVelocidad.setMinorTickSpacing(10);
		sldVelocidad.setPaintLabels(true);
		sldVelocidad.setPaintTicks(true);
		
		sldVelocidad.setPreferredSize(new Dimension(300, 40));
		
		panel1.add(lblVelocidad);
		panel1.add(sldVelocidad);
		
		panel1.setPreferredSize(new Dimension(300, 140));
		
		/*PANEL DERECHO*/
		
		JPanel panel2 = new JPanel();
		JLabel lblControles = new JLabel("Controles del vehículo");
		JButton btnArrancar = new JButton("Arrancar");
		btnArrancar.setPreferredSize(new Dimension(200, 25));
		
		JButton btnParar = new JButton("Parar");
		btnParar.setPreferredSize(new Dimension(200, 25));
		
		JButton btnEstacionar = new JButton("Freno Estacionamiento");
		btnEstacionar.setPreferredSize(new Dimension(200, 25));
		
		panel2.add(lblControles);
		panel2.add(btnArrancar);
		panel2.add(btnParar);
		panel2.add(btnEstacionar);
		
		
		panel2.setPreferredSize(new Dimension(220, 150));
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(panel1);
		add(panel2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ejer02();
	}
	
}
