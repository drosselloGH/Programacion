package parte3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Ejemplo26WindowBuilder extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDNI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo26WindowBuilder frame = new Ejemplo26WindowBuilder();
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
	public Ejemplo26WindowBuilder() {
		setTitle("Ejemplo de Window Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(mntmNuevo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnArchivo.add(mntmAbrir);
		
		JMenuItem mntmCerrar = new JMenuItem("Cerrar");
		mnArchivo.add(mntmCerrar);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelDer = new JPanel();
		panelDer.setBounds(193, 0, 240, 206);
		contentPane.add(panelDer);
		panelDer.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(0, 12, 70, 15);
		panelDer.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(0, 27, 92, 19);
		panelDer.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(0, 70, 70, 15);
		panelDer.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(0, 80, 114, 19);
		panelDer.add(txtApellidos);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setBounds(119, 12, 70, 15);
		panelDer.add(lblDNI);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(114, 27, 114, 19);
		panelDer.add(txtDNI);
		
		JPanel panelIzq = new JPanel();
		panelIzq.setBounds(12, 12, 159, 209);
		contentPane.add(panelIzq);
		panelIzq.setBorder(new LineBorder(new Color(53, 132, 228), 5, true));
		panelIzq.setLayout(null);
		
		JButton btn1 = new JButton("Acción 1");
		btn1.setBounds(22, 12, 113, 25);
		panelIzq.add(btn1);
		
		JButton btn2 = new JButton("Acción 2");
		btn2.setBounds(22, 43, 113, 25);
		panelIzq.add(btn2);
		
		JButton btn3 = new JButton("Acción 3");
		btn3.setBounds(22, 80, 113, 25);
		panelIzq.add(btn3);
	}
}
