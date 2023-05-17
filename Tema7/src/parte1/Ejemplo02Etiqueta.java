package parte1;


import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo02Etiqueta extends JFrame {

	public Ejemplo02Etiqueta() {
		super("Ejemplo con etiquetas");
		setSize(350, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//asi hacemos que todo este alineado a la izquierda
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//cojemos el nombre dle componente, quitamos las vocales y creamos una varible
		//JLabel permite mostrar datos en pantalla
		JLabel lblNombre = new JLabel("Nombre: ");
		//JTextField se muestran como casillas de texto de una linea
		JTextField txtNombre = new JTextField(20);
		JLabel lblApellido = new JLabel("Apellidos: ");
		JTextField txtApellido = new JTextField(20);
		
		add(lblNombre);
		add(txtNombre);
		
		add(lblApellido);
		add(txtApellido);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Ejemplo02Etiqueta ejemplo = new Ejemplo02Etiqueta();

	}

}
