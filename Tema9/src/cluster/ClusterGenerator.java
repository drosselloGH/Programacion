package cluster;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ClusterGenerator extends JFrame {

	public ClusterGenerator() {
		super("Cluster Generator");
		setSize(500, 400);
		setLayout(new FlowLayout(new FlowLayout().LEFT));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel lblGrupo = new JLabel("Grupo");
		JTextArea txtGrupo = new JTextArea();
		txtGrupo.setPreferredSize(new Dimension(100, 23));
		
		JLabel lblIp1 = new JLabel("IP Inicial");
		JTextArea txtIp1 = new JTextArea();
		txtIp1.setPreferredSize(new Dimension(100, 23));
		
		JLabel lblIp2 = new JLabel("IP Final");
		JTextArea txtIp2 = new JTextArea();
		txtIp2.setPreferredSize(new Dimension(100, 23));
		
		JButton btnTexto = new JButton("Generar texto");
		JButton btnArchivo = new JButton("Generar archivo");
		
		
		add(lblGrupo);
		add(txtGrupo);
		add(lblIp1);
		add(txtIp1);
		add(lblIp2);
		add(txtIp2);
		add(btnTexto);
		add(btnArchivo);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ClusterGenerator();
		
	}
	
}

