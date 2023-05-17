package parte3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//podemos implementar directamente la interfaz de ActionListener
public class Ejemplo17ActionListener extends JFrame implements ActionListener {
	//debemos crear la variable global para que el metodo pueda acceder a ella
	private JLabel lblElegido;
	private JComboBox cmbCaja;

	public Ejemplo17ActionListener() {
		super("Paises");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		//añadir un combobox
		cmbCaja = new JComboBox<>();
		cmbCaja.addItem("España");
		cmbCaja.addItem("Estados Unidos");
		cmbCaja.addItem("Alemania");
		cmbCaja.addItem("Suiza");
		cmbCaja.addItem("Otro");
		
		cmbCaja.addActionListener(this);
		lblElegido = new JLabel("El pais elegido es: España");
		
		add(cmbCaja);
		add(lblElegido);
		

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo17ActionListener();

	}

	// traemos el metodo de ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		// setText("mensaje")
		String pais = (String) cmbCaja.getSelectedItem();
		lblElegido.setText("Has elegido el pais: "+pais);

	}
}
