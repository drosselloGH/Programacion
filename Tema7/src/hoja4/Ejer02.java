package hoja4;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejer02 extends JFrame {

	public Ejer02() {
		super("Matrícula");
		setSize(320, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblApellidos = new JLabel("Apellidos");

		JTextField txtApellidos = new JTextField(25);

		JLabel lblNombre = new JLabel("Nombre");

		JTextField txtNombre = new JTextField(25);

		JLabel lblCurso = new JLabel("Curso");

		JComboBox<String> cmbCurso = new JComboBox<>();
		
		JLabel lblNombreCurso = new JLabel();

		cmbCurso.addItem("Selecciona un curso");
		cmbCurso.addItem("1º ESO");
		cmbCurso.addItem("2º ESO");
		cmbCurso.addItem("3º ESO");
		cmbCurso.addItem("4º ESO");
		
		cmbCurso.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int indice = cmbCurso.getSelectedIndex();
				String cursos [] = {"", "Curso: 1º ESO", "Curso: 2º ESO", "Curso: 3º ESO", "Curso: 4º ESO"};
				lblNombreCurso.setText(cursos[indice]);
				
			}
		});
		
		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(lblCurso);
		
		add(cmbCurso);
		add(lblNombreCurso);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer02();

	}
}
