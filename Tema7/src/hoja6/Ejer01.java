package hoja6;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejer01 extends JFrame {

	public Ejer01() {
		super("Libreoffice");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(this, "Error al aplicar el look and feel", "Error de look and feel", JOptionPane.ERROR_MESSAGE);
		}
		
		/*PRIMER MENU*/
		JMenuItem itemFormato = new JMenuItem("Limpiar formato directo");
		JMenuItem itemCaracter = new JMenuItem("Carácter");
		JMenuItem itemParrafo = new JMenuItem("Párrafo");
		JMenuItem itemNum = new JMenuItem("Numeración y viñetas");
		JMenuItem itemPagina = new JMenuItem("Página");
		
		JMenu menuFormato = new JMenu("Formato");
		menuFormato.add(itemFormato);
		menuFormato.addSeparator();
		menuFormato.add(itemCaracter);
		menuFormato.add(itemParrafo);
		menuFormato.add(itemNum);
		menuFormato.addSeparator();
		menuFormato.add(itemPagina);
		
		/*SEGUNDO MENU*/
		JMenuItem itemInsertar = new JMenuItem("Insertar");
		JMenuItem itemEliminar = new JMenuItem("Eliminar");
		JMenuItem itemSeleccionar = new JMenuItem("Seleccionar");
		JMenuItem itemUnir = new JMenuItem("Unir celdas");
		
		JMenu menuTabla = new JMenu("Tabla");
		menuTabla.add(itemInsertar);
		menuTabla.add(itemEliminar);
		menuTabla.add(itemSeleccionar);
		menuTabla.addSeparator();
		menuTabla.add(itemUnir);
		
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.add(menuFormato);
		barraMenu.add(menuTabla);
		
		setJMenuBar(barraMenu);

		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Ejer01();
		
	}
	
}
