package hoja6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejer03 extends JFrame {

	private JLabel img;
	
	public Ejer03() {
		super("Ordenadores de 8 bits");
		setSize(480, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		/* PANEL SUPERIOR */
		JPanel panel1 = new JPanel();

		JComboBox<String> cmbOrdenadores = new JComboBox<String>();
		cmbOrdenadores.addItem("Amstrad CPC 464");
		cmbOrdenadores.addItem("Commodore 64");
		cmbOrdenadores.addItem("Commodores Amiga");
		cmbOrdenadores.addItem("Sinclair ZX Spectrum");

		cmbOrdenadores.setPreferredSize(new Dimension(400, 25));
		panel1.add(cmbOrdenadores);
		panel1.setPreferredSize(new Dimension(200, 30));

		/* PANEL CENTRAL */

		JPanel panel2 = new JPanel();

		img = new JLabel(new ImageIcon("iconos/imgs/amstrad.png"));
		img.setPreferredSize(new Dimension(400, 400));
		panel2.add(img);
		

		cmbOrdenadores.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				int indice = cmbOrdenadores.getSelectedIndex();
				
				if (indice == 0) {
					img.setIcon(new ImageIcon("iconos/imgs/amstrad.png"));
				} else if(indice == 1) {
					img.setIcon(new ImageIcon("iconos/imgs/commodore1.png"));
				} else if(indice == 2) {
					img.setIcon(new ImageIcon("iconos/imgs/commodore2.png"));
				} else if(indice == 3) {
					img.setIcon(new ImageIcon("iconos/imgs/sinclair.png"));
				}

			}
		});
		

		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer03();
	}

}
