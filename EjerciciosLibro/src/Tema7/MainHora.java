package Tema7;

public class MainHora {

	public static void main(String[] args) {
		
		Hora h1 = new Hora();
		
		h1.setHora(25);
		h1.setMinuto(-1);
		h1.setSegundo(45);
		
		h1.incrementarSegundo();
		
		System.out.println(h1.getHora());
		System.out.println(h1.getMinuto());
		System.out.println(h1.getSegundo());
		
	}
	
}
