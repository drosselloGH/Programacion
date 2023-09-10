package Tema8Hora;

public class MainHora {

	public static void main(String[] args) {

		Hora h1 = new Hora(21, 34);
		
		System.out.println(h1);
		
		for (int i = 0; i < 50; i++) {
			h1.inc();
		}
		
		System.out.println(h1);
		
		HoraExacta he1 = new HoraExacta(23, 59, 50);
		
		for (int i = 0; i < 1000; i++) {
			he1.inc();
		}
		
		he1.setHora(21);
		he1.setMinutos(60);
		he1.setSegundo(34);
		
		System.out.println(he1);
		
		HoraExacta he2 = new HoraExacta(23, 12, 57);
		he2 = he1;
		
		System.out.println(he1.equals(he2));
		

	}

}
