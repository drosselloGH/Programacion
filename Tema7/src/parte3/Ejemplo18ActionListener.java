package parte3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Ejemplo18ActionListener extends JFrame implements ActionListener{

	JButton btnHoja;
	JButton btnGrafica;
	JButton btnGuardar;
	JButton btnBombilla;
	JButton btnCalendario;
	JButton btnCamara;
	JButton btnTV;
	JButton btnHerramienta;
	
	public Ejemplo18ActionListener() {
		super("Planificador personal");
		setSize(450, 200);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//con BorderLayout establecemos que se ponga en el borde
		setLayout(new BorderLayout());
		
		//creamos la barra de herramientas
		JToolBar barraHerramientas = new JToolBar();
		
		ImageIcon imgHoja = new ImageIcon("iconos/1.png");
		btnHoja = new JButton(imgHoja);
		btnHoja.addActionListener(this);
		
		ImageIcon imgGrafica = new ImageIcon("iconos/11.png");
		btnGrafica = new JButton(imgGrafica);
		btnGrafica.addActionListener(this);
		
		ImageIcon imgGuardar = new ImageIcon("iconos/22.png");
		btnGuardar = new JButton(imgGuardar);
		btnGuardar.addActionListener(this);
		
		ImageIcon imgBombilla = new ImageIcon("iconos/3.png");
		btnBombilla = new JButton(imgBombilla);
		btnBombilla.addActionListener(this);
		
		ImageIcon imgCalendario = new ImageIcon("iconos/44.png");
		btnCalendario = new JButton(imgCalendario);
		btnCalendario.addActionListener(this);
		
		ImageIcon imgCamara = new ImageIcon("iconos/66.png");
		btnCamara = new JButton(imgCamara);
		btnCamara.addActionListener(this);
		
		ImageIcon imgTV = new ImageIcon("iconos/67.png");
		btnTV = new JButton(imgTV);
		btnTV.addActionListener(this);
		
		ImageIcon imgHerramienta = new ImageIcon("iconos/73.png");
		btnHerramienta = new JButton(imgHerramienta);
		btnHerramienta.addActionListener(this);
		
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
		new Ejemplo18ActionListener();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnHoja) {
			System.out.println("Has pulsado Nuevo");
		} else if(e.getSource() == btnGrafica) {
			System.out.println("Has pulsado Gráfica");
		}  else if(e.getSource() == btnGuardar) {
			System.out.println("Has pulsado Guardar");
		} else if(e.getSource() == btnBombilla) {
			System.out.println("Has pulsado Ayuda");
		} else if(e.getSource() == btnCalendario) {
			System.out.println("Has pulsado Calendario");
		} else if(e.getSource() == btnCamara) {
			System.out.println("Has pulsado Cámara");
		} else if(e.getSource() == btnTV) {
			System.out.println("Has pulsado TV");
		} else if(e.getSource() == btnHerramienta) {
			System.out.println("Has pulsado Herramientas");
		}
		
		/*
		 * lblSetIcon()
		 * */
		
	}

}
