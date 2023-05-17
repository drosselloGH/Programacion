package parte3;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Plantilla extends JFrame {

	public Plantilla() {
		super("Título");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		

		setVisible(true);

	}

	public static void main(String[] args) {

		new Plantilla();

	}
}
