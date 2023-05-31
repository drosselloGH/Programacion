package ejerRandom;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class HallOfFame extends JFrame {

	private static final String NOMBRE_ARCHIVO = "ficheros/HallofFame";

	private JList<String> lstPuntuacion;
	private static DefaultListModel<String> modelo;

	public HallOfFame() {
		super("Puntuaciones");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JLabel lblTitulo = new JLabel("*** Hall of Fame ***");
		modelo = new DefaultListModel<>();
		lstPuntuacion = new JList(modelo);
		lstPuntuacion.setPreferredSize(new Dimension(260, 300));

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nuevoJugador();

			}
		});

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				borrarArchivo();

			}
		});

		add(lblTitulo);
		add(lstPuntuacion);
		add(btnNuevo);
		add(btnBorrar);

		setVisible(true);
	}

	public static void main(String[] args) {
		cargarJugadores();
	}

	/**
	 * Añade un jugador nuevo y su puntuación. Este método es llamado desde el
	 * listener del botón Nuevo.
	 */
	private void nuevoJugador() {
		Jugador jugador = leerDatosJugador();
		guardarJugador(jugador);
		modelo.addElement(jugador.getNombre() + "..." + jugador.getPuntuacion() + " puntos.");

	}

	/**
	 * Pide al usuario los datos de un nuevo jugador y devuelve un objeto Jugador.
	 *
	 * @return Un objeto Jugador con los datos leídos, o null si los datos no son
	 *         válidos.
	 */
	private Jugador leerDatosJugador() {
		String nombre = JOptionPane.showInputDialog(null, "¿Nombre del jugador?", "Nuevo",
				JOptionPane.QUESTION_MESSAGE);
		String puntos = JOptionPane.showInputDialog(null, "¿Puntuación del jugador?", "Nuevo",
				JOptionPane.QUESTION_MESSAGE);

		Jugador jugador = new Jugador(nombre, puntos);

		return jugador;
	}

	/**
	 * Guarda la información de un jugador en el archivo de disco, en formato csv.
	 *
	 * @param jugador Objeto Jugador con el nombre y la puntuación a añadir.
	 */
	public void guardarJugador(Jugador jugador) {
		try {
			FileWriter archivo = new FileWriter(NOMBRE_ARCHIVO, true);
			BufferedWriter buffer = new BufferedWriter(archivo);

			buffer.write(jugador.getNombre() + "," + jugador.getPuntuacion() + "\n");

			buffer.close();

		} catch (IOException e) {
			System.out.println("No se pudo abrir el archivo");
		}

	}

	/**
	 * Lee los datos sobre nombres y puntuaciones de jugadores. Los añade a la lista
	 * que se muestra en la ventana.
	 */
	public static void cargarJugadores() {
		try {
			FileReader archivo = new FileReader(NOMBRE_ARCHIVO);
			new HallOfFame();
			BufferedReader buffer = new BufferedReader(archivo);

			String linea = buffer.readLine();

			while (linea != null) {
				String[] datos = linea.split(",");
				modelo.addElement(datos[0] + "..." + datos[1] + " puntos.\n");
				linea = buffer.readLine();
			}

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,
					"No se han encontrado datos guardados de jugadores. Se creará un archivo nuevo", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE);

			try {
				FileWriter archivo = new FileWriter(NOMBRE_ARCHIVO, true);
			} catch (IOException e1) {
				System.out.println("No se pudo crear");
			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error", "Error de E/S", JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * Borra el contenido del archivo de jugadores, dejándolo en blanco. Y la lista
	 * de jugadores en la ventana. Este método es llamado desde el listener del
	 * botón Borrar.
	 */
	public void borrarArchivo() {

		int borrar = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres borrar todos los datos de jugadores?",
				"Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (borrar == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Operación cancelada. No se ha borrado ningún dato", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			
			try {
				FileWriter archivo = new FileWriter(NOMBRE_ARCHIVO);
				BufferedWriter buffer = new BufferedWriter(archivo);

				buffer.close();
				modelo.clear();
				
			} catch (IOException e) {
				System.out.println("No se pudo borrar los datos");
			}

		}

	}

}
