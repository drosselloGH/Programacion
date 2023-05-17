package ejemplo09SwingAvanzado;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class EjemploJToolBar extends JFrame {

	public EjemploJToolBar() {
		super("Barra de herramientas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JToolBar barraHerramientas = new JToolBar();
		// creamos los botones de la barra
		ImageIcon imgTick = new ImageIcon("iconos/92.png");
		JButton btnTick = new JButton(imgTick);

		ImageIcon imgBaja = new ImageIcon("iconos/baja.png");
		JButton btnBaja = new JButton(imgBaja);
		
		ImageIcon imgCalc = new ImageIcon("iconos/41.png");
		JButton btnCalc = new JButton(imgCalc);

		// metemos los botones dentro de la barra de herramientas
		barraHerramientas.add(btnTick);
		barraHerramientas.add(btnBaja);
		barraHerramientas.addSeparator();
		//añade una separación entre botones
		barraHerramientas.add(btnCalc);

		// añadimos la barra a la ventana
		add(barraHerramientas, BorderLayout.NORTH);

		setVisible(true);

	}

	public static void main(String[] args) {

		new EjemploJToolBar();

	}
}
