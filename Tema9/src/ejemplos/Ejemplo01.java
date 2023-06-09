package ejemplos;
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
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * @author Daniel Rosselló
 * @version 1.0, 16 may 2023
 *
 */

public class Ejemplo01 extends JFrame {

	private JTextArea txtListaTareas;

	public Ejemplo01() {

		super("Tareas");
		setSize(360, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		JLabel lblTareaNueva = new JLabel("Tarea nueva");
		JTextField txtTarea = new JTextField(20);

		JButton btnGuardar = new JButton("Guardar");

		txtListaTareas = new JTextArea();
		JScrollPane panelTareas = new JScrollPane(txtListaTareas);
		panelTareas.setPreferredSize(new Dimension(350, 200));

		// Cargamos las tareas que haya guardadas en el archivo.
		final String NOMBRE_ARCHIVO = System.getProperty("user.home") + "/tareas";

		mostrarTareas(NOMBRE_ARCHIVO);

		btnGuardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Verificamos que se ha escrito una tarea.

				String tarea = txtTarea.getText();
				if (tarea.equals("")) {
					return;
				}

				// Guardamos la tarea en el archivo.
				guardarTarea(tarea, NOMBRE_ARCHIVO);

				// Borramos la tarea.
				txtTarea.setText("");

				// Leemos y actualizamos la lista.
				mostrarTareas(NOMBRE_ARCHIVO);

			}
		});

		add(lblTareaNueva);
		add(txtTarea);
		add(btnGuardar);
		add(panelTareas);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo01();

	}
	
	/**
	 * Guarda una tarea al final del acontenido de un archivo
	 * 
	 * @param tarea Cadena de texto con la tarea
	 * @param NombreArchivo Nombre del archivo en el que se quiere guardar la tarea
	 */

	private void guardarTarea(String tarea, String NombreArchivo) {

		try {
			FileWriter archivo = new FileWriter(NombreArchivo, true);

			BufferedWriter buffer = new BufferedWriter(archivo);

			buffer.write(tarea + "\n");

			buffer.close();
		} catch (IOException e) {
			
			JOptionPane.showMessageDialog(null, "No se ha podido guardar la tarea", "Error al guardar", JOptionPane.ERROR_MESSAGE);
			
		}
	}

	/**
	 * Abre un archivo de texto, lee su contenido y lo muestra en un JTextArea
	 * 
	 * @param nombreArchivo nombre del archivo que se va a leer
	 */
	private void mostrarTareas(String nombreArchivo) {

		int numTareas = 0; // Contador de tareas

		try {

			// Abrimos el archivo para lectura.
			FileReader archivo = new FileReader(nombreArchivo);

			// Creamos un objeto BufferedReader para leer el archivo de forma más eficiente.
			BufferedReader buffer = new BufferedReader(archivo);

			// Leemos la primera línea del archivo.
			String linea = buffer.readLine();
			
			txtListaTareas.setText("");

			// Mientras la línea leía no sea null, vamos mostrando la línea en pantalla y
			// leyendo la siguiente.
			while (linea != null) {

				// Actualizamos el contador de tareas.
				numTareas++;

				txtListaTareas.append(linea + "\n");

				// Leemos la siguiente línea del archivo.
				linea = buffer.readLine();
			}

			// Indicamos cuántas tareas hay guardadas.
			txtListaTareas.append("\nTienes " + numTareas + " tareas pendientes.");

			// Cerramos el archivo.
			buffer.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo de tareas. Se creará uno nuevo.", "Archivo inexistente", JOptionPane.WARNING_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al leer el archivo de tareas", "Error al leer", JOptionPane.ERROR_MESSAGE);
		}

	}

}