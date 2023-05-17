package hoja3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Ejer01 extends JFrame {

	public Ejer01() {
		super("Planificador personal");
		setSize(450, 200);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//con BorderLayout establecemos que se ponga en el borde
		setLayout(new BorderLayout());
		
		//creamos la barra de herramientas
		JToolBar barraHerramientas = new JToolBar();
		
		ImageIcon imgHoja = new ImageIcon("iconos/1.png");
		JButton btnHoja = new JButton(imgHoja);
		
		ImageIcon imgGrafica = new ImageIcon("iconos/11.png");
		JButton btnGrafica = new JButton(imgGrafica);
		
		ImageIcon imgGuardar = new ImageIcon("iconos/22.png");
		JButton btnGuardar = new JButton(imgGuardar);
		
		ImageIcon imgBombilla = new ImageIcon("iconos/3.png");
		JButton btnBombilla = new JButton(imgBombilla);
		
		ImageIcon imgCalendario = new ImageIcon("iconos/44.png");
		JButton btnCalendario = new JButton(imgCalendario);
		
		ImageIcon imgCamara = new ImageIcon("iconos/66.png");
		JButton btnCamara = new JButton(imgCamara);
		
		ImageIcon imgTV = new ImageIcon("iconos/67.png");
		JButton btnTV = new JButton(imgTV);
		
		ImageIcon imgHerramienta = new ImageIcon("iconos/73.png");
		JButton btnHerramienta = new JButton(imgHerramienta);
		
		barraHerramientas.add(btnHoja);
		barraHerramientas.add(btnGrafica);
		barraHerramientas.add(btnGuardar);
		barraHerramientas.add(btnBombilla);
		barraHerramientas.addSeparator();
		barraHerramientas.add(btnCalendario);
		barraHerramientas.add(btnCamara);
		barraHerramientas.add(btnTV);
		barraHerramientas.addSeparator();
		barraHerramientas.add(btnHerramienta);
		
		add(barraHerramientas, BorderLayout.NORTH);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ejer01();

	}

}
