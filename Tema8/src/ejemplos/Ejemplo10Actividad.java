package ejemplos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;

public class Ejemplo10Actividad extends JFrame {

	private JPanel contentPane;
	private JTextArea txtContenido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo10Actividad frame = new Ejemplo10Actividad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejemplo10Actividad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 301);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		JMenuItem itemAbrir = new JMenuItem("Abrir");
		itemAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirArchivo();
			}
		});
		mnArchivo.add(itemAbrir);
		
		JSeparator separator = new JSeparator();
		mnArchivo.add(separator);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mntmSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 449, 242);
		contentPane.add(scrollPane);

		txtContenido = new JTextArea();
		scrollPane.setViewportView(txtContenido);
	}

	private void abrirArchivo() {

		// Abrimos un cuadro de diálogo para elegir el archivo.
		JFileChooser elegirArchivo = new JFileChooser();

		int eleccion = elegirArchivo.showOpenDialog(this);

		// Comprobamos que el usuario no haya cancelado.
		if (eleccion == JFileChooser.CANCEL_OPTION) {
			return;
		}

		// Abrimos el archivo elegido para lectura. Y vamos mostrando línea a línea en
		// el TextArea.
		File archivo = elegirArchivo.getSelectedFile();

		try {
			FileReader lectorArchivo = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(lectorArchivo);

			String linea = buffer.readLine();
			
			txtContenido.setText("");
			
			while (linea != null) {

				txtContenido.append(linea + "\n");
				linea = buffer.readLine();
			}

			// Cerramos el archivo.
			buffer.close();

		} catch (FileNotFoundException fnfe) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo.", "Archivo no encontrado",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error al leer el archivo.", "Error de lectura",
					JOptionPane.ERROR_MESSAGE);
		}

	}
}
