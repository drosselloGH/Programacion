package parte3;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo21ItemListener extends JFrame {

	public Ejemplo21ItemListener() {
		super("Coches");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//esto centra la ventana del programa en la pantalla
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());
		
		JComboBox<String> cmbMarcas = new JComboBox<>();
		
		cmbMarcas.addItem("Ferrari");
		cmbMarcas.addItem("Lamborghini");
		cmbMarcas.addItem("Audi");
		cmbMarcas.addItem("Pontiac");
		cmbMarcas.addItem("Renault");
		cmbMarcas.addItem("Ford");
		cmbMarcas.addItem("Toyota");
		
		JLabel lblModelo = new JLabel("Testarossa");
		
		cmbMarcas.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int indice = cmbMarcas.getSelectedIndex();
				String [] modelos = {"Testarossa", "Diablo", "A8", "Firebird", "Twingo", "Fiesta", "Yaris"};
				
				lblModelo.setText(modelos[indice]);
				
			}
		});
		
		add(cmbMarcas);
		add(lblModelo);
		

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo21ItemListener();

	}
}
