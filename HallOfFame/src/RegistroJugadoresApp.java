import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class RegistroJugadoresApp {
    private JFrame frame;
    private JList<String> jugadoresList;
    private DefaultListModel<String> jugadoresListModel;
    private String archivoJugadores = "ficheros/jugadores.txt";

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                RegistroJugadoresApp window = new RegistroJugadoresApp();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public RegistroJugadoresApp() {
        initialize();
        cargarJugadores();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        jugadoresListModel = new DefaultListModel<>();
        jugadoresList = new JList<>(jugadoresListModel);
        JScrollPane scrollPane = new JScrollPane(jugadoresList);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        frame.getContentPane().add(panelBotones, BorderLayout.SOUTH);

        JButton btnNuevo = new JButton("Nuevo");
        btnNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nuevoJugador();
            }
        });
        panelBotones.add(btnNuevo);

        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                borrarArchivo();
            }
        });
        panelBotones.add(btnBorrar);
    }

    private void nuevoJugador() {
        Jugador jugador = leerDatosJugador();
        if (jugador != null) {
            guardarJugador(jugador);
            jugadoresListModel.addElement(jugador.getNombre() + "..." + jugador.getPuntuacion());
        }
    }

    private Jugador leerDatosJugador() {
        JTextField nombreField = new JTextField();
        JTextField puntuacionField = new JTextField();

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombreField);
        panel.add(new JLabel("Puntuación:"));
        panel.add(puntuacionField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Nuevo Jugador",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String nombre = nombreField.getText();
            String puntuacion = puntuacionField.getText();

            if (!nombre.isEmpty() && !puntuacion.isEmpty()) {
                try {
                    int punt = Integer.parseInt(puntuacion);
                    return new Jugador(nombre, punt);
                } catch (NumberFormatException e) {
                    mostrarError("La puntuación debe ser un número entero.");
                }
            } else {
                mostrarError("Debe completar todos los campos.");
            }
        }
        return null;
    }

    public void guardarJugador(Jugador jugador) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoJugadores, true))) {
            writer.write(jugador.getNombre() + "," + jugador.getPuntuacion());
            writer.newLine();
        } catch (IOException e) {
            mostrarError("Error de E/S al guardar el jugador: " + e.getMessage());
        }
    }

    public void cargarJugadores() {
        File archivo = new File(archivoJugadores);
        if (!archivo.exists()) {
            try {
                archivo.getParentFile().mkdirs();
                archivo.createNewFile();
                mostrarMensaje("No existe el archivo de puntuaciones. Se ha creado uno nuevo.");
            } catch (IOException e) {
                mostrarError("Error de E/S al crear el archivo de puntuaciones: " + e.getMessage());
            }
        } else {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivoJugadores))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    String[] datos = linea.split(",");
                    if (datos.length == 2) {
                        String nombre = datos[0];
                        int puntuacion = Integer.parseInt(datos[1]);
                        jugadoresListModel.addElement(nombre + "..." + puntuacion);
                    }
                }
            } catch (IOException e) {
                mostrarError("Error de E/S al cargar los jugadores: " + e.getMessage());
            }
        }
    }

    public void borrarArchivo() {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea borrar el archivo?",
                "Borrar archivo", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivoJugadores));
                writer.close();
                jugadoresListModel.clear();
            } catch (IOException e) {
                mostrarError("Error de E/S al borrar el archivo: " + e.getMessage());
            }
        } else {
            mostrarMensaje("No se ha borrado el archivo.");
        }
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, "Error de E/S: " + mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}