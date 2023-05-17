package parte3;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo22KeyListener extends JFrame {

	public Ejemplo22KeyListener() {
		super("Teclado");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		JLabel lblTecla = new JLabel("Pulsa una tecla");
		lblTecla.setFont(new Font("Arial", Font.PLAIN, 24));
		
		//añadimos que se pueda leer desde la ventana del programa, sin TextField
		addKeyListener(new KeyListener() {
			
			@Override
			//muestra las teclas "normales"
			public void keyTyped(KeyEvent e) {
				System.out.println("Tecla pulsada");
				//buscamos la letra que hemos escrito
				char tecla = e.getKeyChar();
				//como Label es un string, hay que concatenar
				lblTecla.setText(""+tecla);
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// dejado en blanco a posta

				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				//buscamos el codigo de la tecla
				int codigo = e.getKeyCode();
				
				//comprobamos que tecla hemos pulsado
				//VK -> Virtual Keyboard
				if(codigo == KeyEvent.VK_UP) {
					lblTecla.setText("Flecha arriba");
				} else if(codigo == KeyEvent.VK_DOWN) {
					lblTecla.setText("Flecha abajo");
				}else if(codigo == KeyEvent.VK_LEFT) {
					lblTecla.setText("Flecha izquierda");
				} else if(codigo == KeyEvent.VK_RIGHT) {
					lblTecla.setText("Flecha derecha");
				}

				
			}
		});
		
		
		add(lblTecla);		
		
		

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo22KeyListener();

	}
}
