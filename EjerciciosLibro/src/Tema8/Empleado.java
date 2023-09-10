package Tema8;

public class Empleado extends Persona {

	int salario;

	public Empleado(String nombre, int edad, int estatura, int salario) {
		//usamos el constructor de la superclase, debe ser la primera linea del constructor
		super(nombre, edad, estatura);
		this.salario = salario;
	}

	//reutilizamos el metodo de la superclase
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		super.mostrar();
		System.out.println(salario);
	}

}
