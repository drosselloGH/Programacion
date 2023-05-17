package parte1;


import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo03CheckBox extends JFrame {

	public Ejemplo03CheckBox() {
		super("Ejemplo con CheckBoxes");
		setSize(150, 200);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblTitulos = new JLabel("Titulaciones: ");

		//un JCheckBox se muestra como un texto con una casilla clickable
		JCheckBox chkEso = new JCheckBox("ESO");
		JCheckBox chkBach = new JCheckBox("Bachillerato");
		JCheckBox chkGM = new JCheckBox("Grado Medio");
		JCheckBox chkGS = new JCheckBox("Grado Superior");
		
		
		add(lblTitulos);

		add(chkEso);
		add(chkBach);
		add(chkGM);
		add(chkGS);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo03CheckBox ejemplo = new Ejemplo03CheckBox();

	}

}
