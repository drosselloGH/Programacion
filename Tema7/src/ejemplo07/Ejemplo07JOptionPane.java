package ejemplo07;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Ejemplo07JOptionPane {

	public static void main(String[] args) {

//		JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");

		// null indica el componente padre del panel
		JOptionPane.showMessageDialog(null, "gracias por usar la aplicacion", "Mi aplicacion",
				JOptionPane.QUESTION_MESSAGE);

		String[] asignaturas = { "PROG", "LM", "SI", "ED", "FOL", "BBDD" };
		int asignatura = JOptionPane.showOptionDialog(null, "Elige tu asignatura favorita", "Asignatura preferida", 0,
				JOptionPane.QUESTION_MESSAGE, null, asignaturas, "PROG");

		System.out.println("Tu asignatura favorita es "+asignaturas[asignatura]);
		
		
	}

}
