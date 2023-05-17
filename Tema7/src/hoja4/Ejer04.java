package hoja4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejer04 extends JFrame {

	private int rojo = 0;
	private int verde = 0;
	private int azul = 0;

	public Ejer04() {
		super("Título");
		setSize(235, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER));

		/* color rojo */
		JLabel lblRojo = new JLabel("Rojo");

		JSlider sldRojo = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		sldRojo.setPaintLabels(true);
		sldRojo.setPaintTicks(true);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setMajorTickSpacing(50);

		/* color verde */
		JLabel lblVerde = new JLabel("Verde");

		JSlider sldVerde = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		sldVerde.setPaintLabels(true);
		sldVerde.setPaintTicks(true);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setMajorTickSpacing(50);

		/* color azul */
		JLabel lblAzul = new JLabel("Azul");

		JSlider sldAzul = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		sldAzul.setPaintLabels(true);
		sldAzul.setPaintTicks(true);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setMajorTickSpacing(50);

		/* boton */
		JButton btnColor = new JButton();
		btnColor.setPreferredSize(new Dimension(100, 20));

		JTextField txtColor = new JTextField("#000");
		txtColor.setPreferredSize(new Dimension(70, 20));

		add(lblRojo);
		add(sldRojo);
		add(lblVerde);
		add(sldVerde);
		add(lblAzul);
		add(sldAzul);
		add(btnColor);

		sldRojo.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				rojo = (int) sldRojo.getValue();
				btnColor.setBackground(new Color(rojo, verde, azul));
				txtColor.setText(hexadecimal(rojo, verde, azul));			

			}
		});

		sldVerde.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				verde = (int) sldVerde.getValue();
				btnColor.setBackground(new Color(rojo, verde, azul));
				txtColor.setText(hexadecimal(rojo, verde, azul));

			}
		});

		sldAzul.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				azul = (int) sldAzul.getValue();
				btnColor.setBackground(new Color(rojo, verde, azul));
				txtColor.setText(hexadecimal(rojo, verde, azul));

			}
		});

		btnColor.setBackground(new Color(rojo, verde, azul));
		add(btnColor);
		add(txtColor);
		
		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer04();

	}

	private String hexadecimal(int rojo, int verde, int azul) {


		// el resto
		int restoR;

		// guardamos el numero en hexadecimal
		String rHex = "";

		while (rojo > 0) {
			restoR = rojo % 16;
			rHex = nHex[restoR] + rHex;
			rojo = rojo / 16;

		}

		// el resto
		int restoV;

		// guardamos el numero en hexadecimal
		String vHex = "";

		while (verde > 0) {
			restoV = verde % 16;
			vHex = nHex[restoV] + vHex;
			verde = verde / 16;

		}

		// el resto
		int restoA;

		// guardamos el numero en hexadecimal
		String aHex = "";

		while (azul > 0) {
			restoA = azul % 16;
			aHex = nHex[restoA] + aHex;
			azul = azul / 16;

		};
		return "#"+rHex+""+vHex+""+aHex;
	}
	
	private String aHexadecimal(int valor) {
		
		char caracteres[] = {'A', 'B', 'C', 'D', 'E', 'F' };

		
		int cifra1 = valor/ 16;
		int cifra2 = valor % 16;
		
		return ""+cifra1+cifra2;
	}
	
}
