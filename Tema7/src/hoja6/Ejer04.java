package hoja6;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer04 extends JFrame{

	public Ejer04() {
		super("Colores");
		setSize(255, 255);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel lblColor = new JLabel("COLOR");
		
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
				lblColor.setForeground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblColor.setForeground(Color.red);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				lblColor.setForeground(new Color(0,e.getX(), e.getY()));
				
			}
		});
		
		add(lblColor);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ejer04();
	}
	
}
