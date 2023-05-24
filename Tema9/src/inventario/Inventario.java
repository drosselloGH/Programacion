package inventario;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

public class Inventario extends JFrame {

	private final String NOMBRE_ARCHIVO = "inventario.txt";

	private ArrayList<String> listaArticulos = new ArrayList<>();
	private DefaultListModel<String> modeloListaInventario;
	private JList<String> lstInventario;

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
		modeloListaInventario = new DefaultListModel<>();
		lstInventario = new JList<>(modeloListaInventario);
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

		String articulo = JOptionPane.showInputDialog(null, "Escribe el artículo que quieres añadir",
				"Alta en el inventario", JOptionPane.QUESTION_MESSAGE);
		// escribe el nombre en pantalla
		modeloListaInventario.addElement(articulo);
		listaArticulos.add(articulo);

	}

	private void eliminarArticulo() {

		// TODO: Si hay un elemento seleccionado en el JList, lo eliminamos del
		// mismo y del ArrayList.
		listaArticulos.remove(lstInventario.getSelectedIndex());

	}

	private void buscarArticulo() {

		// TODO: Preguntamos al usuario por un artículo. Si es un dato válido,
		// lo buscamos en el ArrayList y le indicamos la posición o bien que no
		// se encuentra en el inventario.
		try {
			String nombreArticulo = JOptionPane.showInputDialog(null, "¿Qué artículo quieres buscar?",
					"Buscar un artículo", JOptionPane.QUESTION_MESSAGE);

//			if (modeloListaInventario.contains(nombreArticulo)) {
//				JOptionPane.showMessageDialog(null,
//						"El artículo está en la posicion " + modeloListaInventario.get(nombreArticulo),
//						"Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
//			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Escribe bien el nombre", "Error E/S", JOptionPane.ERROR_MESSAGE);
		}

	}

	private void contarArticulos() {
		JOptionPane.showMessageDialog(null, "Hay " + modeloListaInventario.size() + " artículos almacenados",
				"Tamaño del inventario", JOptionPane.INFORMATION_MESSAGE);

	}

	private void borrarInventario() {
		modeloListaInventario.clear();
		// borra el contenido de la lista
		listaArticulos.clear();

	}

	private void cargarInventario() {

		// TODO: Leemos el contenido del archivo inventario.txt y lo vamos
		// almacenando en el ArrayList y en el JList.
		try {
			FileReader archivo = new FileReader("ficheros/" + NOMBRE_ARCHIVO);
			BufferedReader buffer = new BufferedReader(archivo);

			String linea = buffer.readLine();

			while (linea != null) {
				linea = buffer.readLine();
				modeloListaInventario.addElement(linea);
				listaArticulos.add(linea);
			}

			buffer.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error al arbir el archivo para lectura.",
					"Error de E/S", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void guardarInventario() {

		// TODO: Guardamos el contenido del ArrayList en el archivo
		// inventario.txt.
		try {
			FileWriter archivo = new FileWriter("ficheros/" + NOMBRE_ARCHIVO);
			BufferedWriter buffer = new BufferedWriter(archivo);

			for (String articulo : listaArticulos) {
				buffer.write(articulo + "\n");
			}

			buffer.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error al arbir el archivo para escritura.",
					"Error de E/S", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static void main(String[] args) {
		new Inventario();
	}
}
