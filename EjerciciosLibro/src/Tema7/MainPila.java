package Tema7;

public class MainPila {

	public static void main(String[] args) {
		
		Pila p = new Pila();
		
		System.out.println(p.desapilar());
		
		for (int i = 0; i < 10; i++) {
			p.apilar(i);
		}
		Integer num = p.desapilar();
		while(num != null) {
			System.out.print(num+" ");
			num = p.desapilar();
		}
		
	}
	
}
