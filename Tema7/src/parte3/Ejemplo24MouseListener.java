package parte3;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo24MouseListener extends JFrame {

	public Ejemplo24MouseListener() {
		super("Eventos de ratón");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		setLocationRelativeTo(null);
		
		JLabel lblPosicion = new JLabel("Mueve el ratón por la ventana");
		JLabel lblBoton = new JLabel();
		add(lblPosicion);
		add(lblBoton);
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				lblPosicion.setText("x = "+e.getX()+" y = "+e.getY());
				
				String botones [] = {"Click izquierdo", "Rueda raton", "Click derecho"}; 
				int num = e.getButton();
				
				lblBoton.setText("Botón pulsado: "+botones[num -1]);
				
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo24MouseListener();

	}
}
