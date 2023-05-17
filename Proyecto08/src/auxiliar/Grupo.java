package auxiliar;

public class Grupo {

	private int id;
	private String nivel;
	private int curso;
	private String clase;

	//constructor 1
	public Grupo() {
		
	}
	
	//constructor 2
	public Grupo(int id, String nivel, int curso, String clase) {
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}
	
	//mostrar los datos del grupo
	public String toString() {
		return "Datos del grupo: \n\tID: "+ id+"\n\tNivel: "+nivel+"\n\tCurso: "+curso+"\n\tClase: "+clase;
	}
	
	//pregunta por terminal los datos del grupo
	public static void leeDatos() {
		System.out.println("Id del grupo: ");
		System.out.println("Nivel del grupo: ");
		System.out.println("Curso: ");
		System.out.println("Clase: ");
	}
	
}
