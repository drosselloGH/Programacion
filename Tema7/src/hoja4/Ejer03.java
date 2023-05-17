package hoja4;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer03 extends JFrame {

	// creamos una variable local, con un valor de 0
	// para que todos los metodos de ItemListener
	// puedan añadir su precio
	private int precioBillete, precioTransporte, precioHotel, precioPension = 0;

	public Ejer03() {
		super("Viajes Gorrión");
		setSize(180, 250);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblOpciones = new JLabel("Opciones:");

		JCheckBox chkBilletes = new JCheckBox("Billetes de avión", true);

		// precio 120
		JCheckBox chkTransporte = new JCheckBox("Transporte aeropuerto");

		// precio 40
		JCheckBox chkHotel = new JCheckBox("Estancia en el hotel");

		// precio 180
		JCheckBox chkPension = new JCheckBox("Pensión completa");
		// precio 70

		JLabel lblPrecio = new JLabel("Precio total: 120$");

		/* ITEM LISTENERS */

		chkBilletes.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				int vecesTocado = 0;
				vecesTocado++;
				if(vecesTocado % 2 == 0) {
					precioBillete = 120;
				}
				precioBillete = 0;

			}
		});

		chkTransporte.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(chkTransporte.isSelected()) {
					precio += ;
				}


			}
		});

		chkHotel.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				int vecesTocado = 0;
				vecesTocado++;
				if(vecesTocado % 2 == 0) {
					precioHotel = 180;
				}
				precioHotel= 0;

			}
		});

		chkPension.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				int vecesTocado = 0;
				vecesTocado++;
				if(vecesTocado % 2 == 0) {
					precioPension = 70;
				}
				precioPension = 0;

			}
		});
		
		lblPrecio.setText("Precio total: "+precioBillete+precioTransporte+precioHotel+precioPension);

		add(lblOpciones);
		add(chkBilletes);
		add(chkTransporte);
		add(chkHotel);
		add(chkPension);

		add(lblPrecio);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer03();

	}

}
