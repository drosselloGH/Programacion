package ejemplo02;

public abstract class Vehiculo {

	protected String matricula;
	protected String marca;
	protected String modelo;
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void mostrar() {
		System.out.println("Datos del vehículo:");
		System.out.println("Matrícula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
	}

}
