package hoja1;

import javax.swing.JOptionPane;

public class Ejer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] series = {"Breaking Bad", "The Boys", "The Offie"};
		int serie = JOptionPane.showOptionDialog(null, "Elige tu serie favorita", "Cual es la mejor serie?", 0, JOptionPane.INFORMATION_MESSAGE, null, series, -1);
		
		System.out.println("Tu serie favorita es: "+series[serie]);

	}

}
