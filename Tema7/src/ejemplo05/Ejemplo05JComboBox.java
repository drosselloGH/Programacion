package ejemplo05;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo05JComboBox extends JFrame {

	public Ejemplo05JComboBox() {
		super("Precios");

		setSize(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblRango = new JLabel("Rango de precios: ");
		// creamos una lista desplegable e indicamos el tipo de datos que llevara (entre < y >)
		JComboBox<String> cmbRango = new JComboBox<>();

		cmbRango.addItem("Menos de 5 auros");
		cmbRango.addItem("Menos de 10 euros");
		cmbRango.addItem("Menos de 50 euros");
		cmbRango.addItem("Otros");
		
		//establecemos un tamaño predefinido para el ComboBox
		cmbRango.setPreferredSize(new Dimension(180, 30));

		add(lblRango);
		add(cmbRango);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo05JComboBox();

	}

}