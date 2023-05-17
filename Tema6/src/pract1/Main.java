package pract1;

public class Main {

	private String nombre;
	private double duracion;
	
	public static void main(String[] args) {
		//no puedo crear una objeto cuando la clase es abstracta
		Mp3 mp1 = new Mp3("cancion1", 120, "nadie", "folk", 1);
		Ogg o1 = new Ogg("cosa", 200, "No", "pop", 2);
		
		//se me genera un Override del metodo reproducir()
		//no se puede crear un objeto de una clase abstracta
//		Medio medio = new Medio("John Wick", 230) {
//			
//			@Override
//			public void reproducir() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		
		
		//creamos un objeto Mp3
		Medio m1 = new Mp3("hola", 210, "yomismo", "hardcore", 2);
		//puedo acceder al metodo reproducir(), porque se encuentra
		//dentro del objeto Musica, padre de Mp3
		m1.reproducir();
		//el metodo guardar no se encuentra en la clase padre
		//por eso no se le puede llamar desde Medio
		//m1.guardar();
		
		//casteamos Mp3, convertimos m1 a Mp3
		((Mp3)m1).guardar();
	
		
		//puedo asignar un objeto de tipo Ogg como variable de tipo Guardable
		//porque Ogg implementa a Guardable
		Guardable gl = new Ogg("si", 30, "yomismo", "pop", 1);
		
		
//		System.out.println(mp1.guardar());

	}
	
}
