package biblioteca;

public class Autor {

	private String nombre;
	private String email;
	private int fechaNacimiento;

	public Autor(String nombre, String email, int fechaNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Autor(String nombre) {
		this.nombre = nombre;
		this.email = "Unknown";
		this.fechaNacimiento = 0;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String toString() {
		return "Datos autor: \n Nombre:"+nombre+"\n Email:"+email+"\n Fecha nacimiento "+fechaNacimiento;
	}

}
