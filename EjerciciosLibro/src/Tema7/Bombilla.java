package Tema7;

public class Bombilla {

	private boolean estado = false;
	private static boolean interruptor = true;
	
	public void mostrarEstado() {
		if(estado == false || interruptor == false) {
			System.out.println("Apagada");
		} else if(estado == true && interruptor == true) {
			System.out.println("Encendida");
		}
	}
	
	public void interruptorGeneral() {
		System.out.println("\nCambiando interruptor general\n");
		interruptor = !interruptor;
	}

	public boolean isEstado() {
		return estado;
	}

	public void interruptorBombilla() {
		estado = !estado;
	}

	public boolean isInterruptor() {
		return interruptor;
	}
	
	
	
}
