package ejemplo02;

public class Main {

	public static void main(String[] args) {
		
		Moto mt1 = new Moto("bafaf", "fasfof", "fafasf", 76);
		
		mt1.mostrar();
		
		Coche coche = new Coche("afoasf", "fabfasfa", "afas", 1);
		
		coche.mostrar();
		
		//al ser abstracto, no se puede crear un vehiculo
		//Vehiculo vh = new Vehiculo("fbaf", "foabhfàf", "asbfaf");
		
		System.out.println(mt1.getCilindrada());
		System.out.println(Moto.getCilindrada());
		
	}

	
	
}
