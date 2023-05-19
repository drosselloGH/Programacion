import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class HallOfFame extends JFrame {
	public HallOfFame() {
		super("Puntuaciones");
		setSize(330, 500);
		setLayout(new FlowLayout());

		JLabel lblHall = new JLabel("***Hall of Fame***");

		JList<String> lstJugadores = new JList<>();
		JScrollPane srcPanel = new JScrollPane(lstJugadores);

		srcPanel.setPreferredSize(new Dimension(320, 400));

		JButton btnNuevo = new JButton("Nuevo");

		btnNuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = JOptionPane.showInputDialog("¿Nombre del jugador?");
				String puntuacion = JOptionPane.showInputDialog("¿Puntuación del jugador?");
				nuevoJugador();

			}
		});

		JButton btnBorrar = new JButton("Borrar");

		btnBorrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int borrar = JOptionPane.showConfirmDialog(null,
						"¿Seguro que quieres borrar todos los datos de jugadores?");

			}
		});

		add(lblHall);
		add(srcPanel);
		add(btnNuevo);
		add(btnBorrar);

		setVisible(true);
	}

	public static void main(String[] args) {
		new HallOfFame();

		try {
			// el archivo existe
			FileReader archivo = new FileReader("ficheros/jugadores.txt");

		} catch (FileNotFoundException e) {
			// el archivo no existe
			JOptionPane.showMessageDialog(null,
					"No se han encontrado datos guardados de jugadores. Se creará un archivo nuevo");
			try {
				FileWriter archivo = new FileWriter("ficheros/jugadores.txt");
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "No se ha podido crear el archivo");
			}
		}

	}

	/**
	 * Añade un jugador nuevo y su puntuación. Este método es llamado desde el
	 * listener del botón Nuevo.
	 */
	private void nuevoJugador() {
	}
	/**
	 * Pide al usuario los datos de un nuevo jugador y devuelve un objeto Jugador.
	 *
	 * @return Un objeto Jugador con los datos leídos, o null si los datos no son
	 *         válidos.
	 */
//	private Jugador leerDatosJugador() {
//	}
	/**
	 * Guarda la información de un jugador en el archivo de disco, en formato csv.
	 *
	 * @param jugador Objeto Jugador con el nombre y la puntuación a añadir.
	 */

//	public void guardarJugador(Jugador jugador) {
//	}
	/**
	 * Lee los datos sobre nombres y puntuaciones de jugadores. Los añade a la lista
	 * que se muestra en la ventana.
	 */
	public void cargarJugadores() {
	}

	/**
	 * Borra el contenido del archivo de jugadores, dejándolo en blanco. Y la lista
	 * de jugadores en la ventana. Este método es llamado desde el listener del
	 * botón Borrar.
	 */
	public void borrarArchivo() {
	}
}
