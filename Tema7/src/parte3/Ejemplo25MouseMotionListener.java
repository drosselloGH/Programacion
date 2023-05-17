package parte3;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo25MouseMotionListener extends JFrame {

	public Ejemplo25MouseMotionListener() {
		super("Eventos de ratón");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		setLocationRelativeTo(null);
		
		JLabel lblPosicion = new JLabel("Mueve el ratón");
		add(lblPosicion);
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				lblPosicion.setText("X: "+e.getX()+"\tY: "+e.getY());
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				lblPosicion.setText("X: "+e.getX()+"\tY: "+e.getY());
				
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo25MouseMotionListener();

	}
}
