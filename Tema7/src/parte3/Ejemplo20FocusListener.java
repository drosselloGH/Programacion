package parte3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ejemplo20FocusListener extends JFrame {

	JTextField txt1;
	JTextField txt2;
	JTextField txt3;
	JLabel lblPromedio;

	public Ejemplo20FocusListener() {
		super("Promedios");
		setSize(200, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		txt1 = new JTextField("0", 5);
		txt2 = new JTextField("0", 5);
		txt3 = new JTextField("0", 5);

		lblPromedio = new JLabel("La media es: 0");

		// creamos un foco
		txt1.addFocusListener(new FocusListener() {

			// cuando deja de fijarse en el texto
			@Override
			public void focusLost(FocusEvent e) {
				txt1.setBackground(Color.WHITE);

			}

			// cuando se fija en el texto
			@Override
			public void focusGained(FocusEvent e) {
				txt1.setBackground(Color.YELLOW);
				calcularPromedio();
			}
		});

		txt2.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txt2.setBackground(Color.WHITE);

			}

			@Override
			public void focusGained(FocusEvent e) {
				txt2.setBackground(Color.YELLOW);
				calcularPromedio();
			}
		});

		txt3.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txt3.setBackground(Color.WHITE);

			}

			@Override
			public void focusGained(FocusEvent e) {
				txt3.setBackground(Color.YELLOW);
				calcularPromedio();
			}
		});

		add(txt1);
		add(txt2);
		add(txt3);
		add(lblPromedio);

		setVisible(true);

	}

	private void calcularPromedio() {
		// getText() devuelve el texto

		//probamos que el usuario no lo deje en blanco
		try {
			double num1 = Double.parseDouble(txt1.getText());
			double num2 = Double.parseDouble(txt2.getText());
			double num3 = Double.parseDouble(txt3.getText());

			double promedio = (num1 + num2 + num3) / 3;

			// mostramos una cantidad x de decimales
			// .X decimales
			String resultado = String.format("la media es %.2f", promedio);

			// puesto que lblPromedio actua como una Sting
			lblPromedio.setText(resultado);
		} catch (NumberFormatException e) {
			/*
			 * CAMBIAR POR UN OPTION PANE Y CON UN MENSAJE DE ERROR
			 * 
			 * */
			lblPromedio.setText("## Datos incorrectos ##");
		}

	}

	public static void main(String[] args) {

		new Ejemplo20FocusListener();

	}
}
