package ejerRandom;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.spi.AbstractSelectableChannel;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class EjemploFChooser extends JFrame {

	EjemploFChooser() {
		super("Elegir archivo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setLayout(new FlowLayout());
		JButton btnAbrir = new JButton("Abrir");
		JButton btnGuardar = new JButton("Guardar");
		btnAbrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser elegir = new JFileChooser();
				int resultado = elegir.showOpenDialog(null);
				
				if(resultado == JFileChooser.CANCEL_OPTION) {
					System.out.println("No se ha elegido nada");
				} else if(resultado == JFileChooser.APPROVE_OPTION) {
					System.out.println(elegir.getSelectedFile().toString());
				}
				
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser elegir = new JFileChooser();
				int resultado = elegir.showSaveDialog(null);
				
				if(resultado == JFileChooser.CANCEL_OPTION) {
					System.out.println("Se ha cancelado el guardado");
				} else if(resultado == JFileChooser.APPROVE_OPTION) {
					System.out.println("Has guardado el archivo: "+elegir.getSelectedFile().toString());
				}
			}
		});
		add(btnAbrir);
		add(btnGuardar);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EjemploFChooser();

	}

}
