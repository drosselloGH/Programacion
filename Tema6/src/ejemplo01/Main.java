package ejemplo01;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Dani", "Rossello", "babf7", "fhbafbafsf");
		
		c1.mostrar();
		System.out.println();
		
		Empleado emp1 = new Empleado("Alvaro", "Feria", "es ilegal", 0);
		emp1.mostrar();
		
		//al ser una clase abstracta, no podemos crear una persona per se
//		//Persona p = new Persona("Manue", "Goteras", "fafaff3");
		
		//Polimorfismo
		//podemos asignar un objeto Cliente a una variable de tipo Persona
		Persona per = new Cliente("Luis", "Lopez", "gbapifuafaf78", "bbaiosfbausi");
		System.out.println();
		
		//si llamamos al metodo mostrar() se ejecutara el de Cliente
		per.mostrar();
		
		//si el metodo mostrar() no existiera en la clase padre, Persona, 
		//no podriamos llamarlo salvo haciendo un cast a Cliente
		((Cliente) per).mostrar();
		System.out.println();
		
		System.out.println(c1.toString());
		
		//probamos el metodo equals() de empleado
		Empleado emp2 = new Empleado("Carlos", "Perez", "10000000", 4);
		
		System.out.println("E1 y e2 son iguales? "+emp1.equals(emp2));
		
		Empleado emp3 = new Empleado("Carlos", "Perez", "10000000", 4);
		System.out.println("E1 y e2 son iguales? "+(emp2==emp3));
		
		Cliente c2 = new Cliente("Dani", "Rossello", "babf7", "fhbafbafsf");
		System.out.println(c1.equals(c2));
		
	}
	
}
