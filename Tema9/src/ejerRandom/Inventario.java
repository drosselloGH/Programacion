package ejerRandom;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Inventario extends JFrame {

	private final String NOMBRE_ARCHIVO = "inventario.txt";

	private ArrayList<String> listaArticulos = new ArrayList<>();
	private DefaultListModel modeloListaInventario;
	private JList lstInventario;

	public static void main(String[] args) {
		new Inventario();
	}

	public Inventario() {
		super("Inventario");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		// PANEL NORTE - BARRA DE HERRAMIENTAS
		JToolBar barraHerramientas = new JToolBar();

		JButton btnAdd = new JButton(new ImageIcon("iconos/13.png"));
		btnAdd.setToolTipText("Añadir un artículo");
		btnAdd.addActionListener(new ActionListener() {

			// Añadimos un elemento al inventario.
			@Override
			public void actionPerformed(ActionEvent arg0) {
				anyadirArticulo();
			}

		});

		JButton btnDel = new JButton(new ImageIcon("iconos/14.png"));
		btnDel.setToolTipText("Borrar el artículo seleccionado");
		btnDel.addActionListener(new ActionListener() {

			// Borramos un elemento del inventario.
			@Override
			public void actionPerformed(ActionEvent arg0) {
				eliminarArticulo();
			}

		});

		JButton btnBuscar = new JButton(new ImageIcon("iconos/84.png"));
		btnBuscar.setToolTipText("Buscar un artículo");
		btnBuscar.addActionListener(new ActionListener() {

			// Buscamos si un artículo está en el inventario.
			@Override
			public void actionPerformed(ActionEvent e) {
				buscarArticulo();
			}

		});

		JButton btnTamanyo = new JButton(new ImageIcon("iconos/41.png"));
		btnTamanyo.setToolTipText("Contar los elementos del inventario");
		btnTamanyo.addActionListener(new ActionListener() {

			// Informamos de cuántos elementos hay en el inventario.
			@Override
			public void actionPerformed(ActionEvent e) {
				contarArticulos();
			}

		});

		JButton btnBorrarLista = new JButton(new ImageIcon("iconos/31.png"));
		btnBorrarLista.setToolTipText("Borrar todo el inventario");
		btnBorrarLista.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				borrarInventario();
			}

		});

		barraHerramientas.add(btnAdd);
		barraHerramientas.add(btnDel);
		barraHerramientas.addSeparator();
		barraHerramientas.add(btnBuscar);
		barraHerramientas.add(btnTamanyo);
		barraHerramientas.add(btnBorrarLista);

		add("North", barraHerramientas);

		// PANEL CENTRO
		modeloListaInventario = new DefaultListModel();
		lstInventario = new JList(modeloListaInventario);
		JScrollPane panelInventario = new JScrollPane(lstInventario);

		add("Center", panelInventario);

		// VENTANA COMPLETA.
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				cargarInventario();
			}

			@Override
			public void windowIconified(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
			}

			@Override
			public void windowClosing(WindowEvent e) {
				guardarInventario();
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowActivated(WindowEvent e) {
			}
		});

		setVisible(true);
	}

	private void anyadirArticulo() {

		// TODO: Preguntamos al usuario el nombre del artículo que quiere añadir
		// y, si es un dato válido, lo añadimos al ArrayList y al JList.
		
	}

	private void eliminarArticulo() {

		// TODO: Si hay un elemento seleccionado en el JList, lo eliminamos del
		// mismo y del ArrayList.
		
	}

	private void buscarArticulo() {

		// TODO: Preguntamos al usuario por un artículo. Si es un dato válido,
		// lo buscamos en el ArrayList y le indicamos la posición o bien que no
		// se encuentra en el inventario.
		
	}

	private void contarArticulos() {

		// TODO: Le decimos al usuario cuántos elementos hay guardados en el
		// inventario.
		
	}

	private void borrarInventario() {

		// TODO: Borramos el contenido del ArrayList.
		
	}

	private void cargarInventario() {

		// TODO: Leemos el contenido del archivo inventario.txt y lo vamos
		// almacenando en el ArrayList y en el JList.
		
	}

	private void guardarInventario() {

		// TODO: Guardamos el contenido del ArrayList en el archivo
		// inventario.txt.
		
	}

}