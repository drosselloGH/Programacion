import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejemplo12MenuBar extends JFrame {

	public Ejemplo12MenuBar() {
		super("Barra de menú");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		JMenu menuArchivo = new JMenu("Archivo");
		
		JMenuItem itemNuevo = new JMenuItem("Nuevo");
		JMenuItem itemAbrir = new JMenuItem("Abrir");
		JMenuItem itemGuardar = new JMenuItem("Guardar");
		JMenuItem itemImportar = new JMenuItem("Importar");
		
		menuArchivo.add(itemNuevo);
		menuArchivo.add(itemAbrir);
		menuArchivo.add(itemGuardar);
		menuArchivo.addSeparator();
		menuArchivo.add(itemImportar);
		
		
		
		
		JMenu menuEditar = new JMenu("Editar");

		JMenuItem itemCortar = new JMenuItem("Cortar");
		JMenuItem itemPegar = new JMenuItem("Pegar");
		JMenuItem itemEditar = new JMenuItem("Editar");
		
		menuEditar.add(itemCortar);
		menuEditar.add(itemPegar);
		menuEditar.add(itemEditar);
		
		
		JMenu menuHerramientas = new JMenu("Herramientas");
		JMenu menuAyuda = new JMenu("Ayuda");
		
		JMenuBar barraMenu = new JMenuBar();
		
		barraMenu.add(menuArchivo);
		barraMenu.add(menuEditar);
		barraMenu.add(menuHerramientas);
		barraMenu.add(menuAyuda);
		
		
		
		setJMenuBar(barraMenu);
		
		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo12MenuBar();

	}
}
