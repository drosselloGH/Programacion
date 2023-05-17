package parte3;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo23KeyListener extends JFrame {

	private int x;
	private int y;
	
	public Ejemplo23KeyListener() {
		super("Star TV");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// tambien llamado Absolute layout
		setLayout(null);

		ImageIcon imgEmoji = new ImageIcon("iconos/9.png");
		JLabel emoji = new JLabel(imgEmoji);

		add(emoji);

		//valores iniciales de posicion
		x = 200;
		y = 10;
		
		// indicamos la posicion del emoji, al igual que su tamaño en px
		emoji.setBounds(x, y, 24, 24);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				//forma de abreviar
				char letra = e.getKeyChar();
				
				if(letra == 'w' && y > 0) {
					y = y - 5;
				} else if(letra == 's' && y <240) {
					y = y +5;
					emoji.setBounds(x, y, 24, 24);
				}else if(letra == 'a' && x > 0) {
					x = x - 5;
					emoji.setBounds(x, y, 24, 24);
				}else if(letra == 'd' && x < 376) {
					x = x + 5;
					emoji.setBounds(x, y, 24, 24);
				}
				emoji.setBounds(x, y, 24, 24);


			}

			@Override
			public void keyReleased(KeyEvent e) {
				// no lo usamos

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// no lo usamos

			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo23KeyListener();

	}
}
