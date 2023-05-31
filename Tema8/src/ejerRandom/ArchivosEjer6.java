package ejerRandom;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;

public class ArchivosEjer6 extends JFrame {

	public ArchivosEjer6() {
		super("Menu");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JMenu barraAbrir = new JMenu();
		
		
		add(barraAbrir);		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ArchivosEjer6();
	}
	
}
