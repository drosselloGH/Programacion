
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ejemplo10Listas extends JFrame {

	public Ejemplo10Listas() {
		super("Lista compra");
		setSize(150, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER));

		String[] listaCompra = {"Leche", "Huevos", "Pan", "Verdura", "Pescado", "Carne", "Detergente", "Vino", "Arroz", "Trembo" };

		JLabel lblProductos = new JLabel("Productos");
		
		JList lstCompra = new JList(listaCompra);
		// no lleva barra de scroll, hay que crearlo
		JScrollPane panelCompra = new JScrollPane(lstCompra);
		
		JButton btnComprar = new JButton("Comprar");
		
		
		
		
		add(lblProductos);
		add(panelCompra);
		add(btnComprar);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo10Listas();

	}
}
