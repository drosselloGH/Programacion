package hoja5;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejer03 extends JFrame {

	public Ejer03() {
		super("Operaciones");
		setSize(220, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblA = new JLabel("Operando A");
		JTextField txtA = new JTextField(10);
		txtA.setPreferredSize(new Dimension(100, 20));

		JLabel lblB = new JLabel("Operando B");
		JTextField txtB = new JTextField(10);
		txtB.setPreferredSize(new Dimension(100, 20));

		JLabel lblOperacion = new JLabel("Operación");
		JComboBox<String> cmbOperaciones = new JComboBox<String>();

		cmbOperaciones.addItem("Suma");
		cmbOperaciones.addItem("Resta");
		cmbOperaciones.addItem("Multiplicar");
		cmbOperaciones.addItem("Dividir");

		JLabel lblResultado = new JLabel("Resultado");
		JTextField txtResultado = new JTextField();
		txtResultado.setPreferredSize(new Dimension(125, 20));

		cmbOperaciones.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					int operacion = cmbOperaciones.getSelectedIndex();
					if (operacion == 0) {
						txtResultado
								.setText("" + (Integer.parseInt(txtA.getText()) + Integer.parseInt(txtB.getText())));
					} else if (operacion == 1) {
						txtResultado
								.setText("" + (Integer.parseInt(txtA.getText()) - Integer.parseInt(txtB.getText())));
					} else if (operacion == 2) {
						txtResultado
								.setText("" + (Integer.parseInt(txtA.getText()) * Integer.parseInt(txtB.getText())));
					} else if (operacion == 3) {
						txtResultado.setText(
								"" + (Double.parseDouble(txtA.getText()) / Double.parseDouble(txtB.getText())));
					}
				} catch (Exception e1) {
					txtResultado.setText("Error");
				}

			}
		});

		add(lblA);
		add(txtA);
		add(lblB);
		add(txtB);
		add(lblOperacion);
		add(cmbOperaciones);
		add(lblResultado);
		add(txtResultado);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer03();
	}

}
