package hoja3;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejer04 extends JFrame {

	public Ejer04() {
		super("Asistente matemático");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		JMenu menuAritmetico = new JMenu("Aritmética");
		
		JMenuItem itemSuma = new JMenuItem("Suma");
		JMenuItem itemResta = new JMenuItem("Resta");
		JMenuItem itemMultiplicar = new JMenuItem("Multiplicar");
		JMenuItem itemDividir = new JMenuItem("Dividir");
		JMenuItem itemPorcentaje = new JMenuItem("Porcentaje");
		
		menuAritmetico.add(itemSuma);
		menuAritmetico.add(itemResta);
		menuAritmetico.addSeparator();
		menuAritmetico.add(itemMultiplicar);
		menuAritmetico.add(itemDividir);
		menuAritmetico.addSeparator();
		menuAritmetico.add(itemPorcentaje);
		
		JMenu menuCalculo = new JMenu("Cálculo");
		
		JMenuItem itemDerivada = new JMenuItem("Derivada");
		JMenuItem itemIntegral = new JMenuItem("Integral");
		JMenuItem itemTaylor = new JMenuItem("Polinomio d Taylor");
		JMenuItem itemEDiferencial = new JMenuItem("Ecuación diferencial");
		
		menuCalculo.add(itemDerivada);
		menuCalculo.add(itemIntegral);
		menuCalculo.addSeparator();
		menuCalculo.add(itemTaylor);
		menuCalculo.add(itemEDiferencial);
		
		
		JMenuBar barraMenu = new JMenuBar();
		
		barraMenu.add(menuAritmetico);
		barraMenu.add(menuCalculo);
		
		setJMenuBar(barraMenu);
		
		

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer04();

	}
}
