package hoja3;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Ejer02 extends JFrame {

	public Ejer02() {
		super("Selección de modelo");
		setSize(300, 200);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		String[] listaMarcas = { "Peugeot", "Volkswagen", "Renault", "Seat", "Ferrari", "Porsche", "Jaguar", "Dacia", "Ford", "Mercedes", "Lamborghini" };

		JList<String> lista = new JList<>(listaMarcas);

		JScrollPane scrPanel = new JScrollPane(lista);

		JLabel lblModelo = new JLabel("Modelo?");

		add(scrPanel);
		add(lblModelo);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer02();

	}

}
