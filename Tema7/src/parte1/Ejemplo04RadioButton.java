package parte1;


import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ejemplo04RadioButton extends JFrame {

	public Ejemplo04RadioButton() {
		super("Islas Baleares");

		setSize(150, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		// un JRadioButton se muestra como un boton de radio,
		// con "true" como segundo parametro, indicamos que sera la opcion
		// predeterminada
		JRadioButton rdbMallorca = new JRadioButton("Mallorca", true);
		JRadioButton rdbMenorca = new JRadioButton("Menorca");
		JRadioButton rdbIbiza = new JRadioButton("Ibiza");
		JRadioButton rdbFormentera = new JRadioButton("Formentera");

		// creamos un grupo de botones para evitar que pueda seleccionar
		// mas de una opcion, con ButtonGroup
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbMallorca);
		grupo.add(rdbMenorca);
		grupo.add(rdbFormentera);
		grupo.add(rdbIbiza);

		add(rdbMallorca);
		add(rdbMenorca);
		add(rdbIbiza);
		add(rdbFormentera);

		setVisible(true);
	}

	public static void main(String[] args) {

		Ejemplo04RadioButton ejemplo = new Ejemplo04RadioButton();

	}

}
