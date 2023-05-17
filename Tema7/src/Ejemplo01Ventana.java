

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//para crear una ventana, creamos una clase que herede de JFrame
public class Ejemplo01Ventana extends JFrame {

	// En el constructor de la clase configuraremos la ventana
	public Ejemplo01Ventana() {

		// damos titulo a la ventana
		super("Mi primera ventana");

		// asignamos un tamaño, 500px ancho, 400px alto
		setSize(500, 400);

		// hacemos que cuando se pulse el boton de cerrar ventana,
		// el programa se cierre
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// asignamos un layout (disposicion) de tipo FlowLayout,
		// asi los componentes se iran colocando de izquierda a derecha
		// y mantendran su tamaño
		setLayout(new FlowLayout());

		// añadimos un boton
		JButton botonPlay = new JButton("Play");
		// añadimos el boton a la pantalla
		add(botonPlay);

		JButton boton2 = new JButton("Stop");
		add(boton2);

		// hacemos la ventana visible
		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo01Ventana ventana = new Ejemplo01Ventana();

	}

}
