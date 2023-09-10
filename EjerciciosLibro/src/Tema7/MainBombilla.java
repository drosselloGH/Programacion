package Tema7;

public class MainBombilla {

	public static void main(String[] args) {

		Bombilla b1 = new Bombilla();

		System.out.println("Info Bombilla1");
		System.out.println("Interruptor: " + b1.isInterruptor());
		System.out.println("Estado bombilla: " + b1.isEstado());
		b1.mostrarEstado();

		Bombilla b2 = new Bombilla();

		System.out.println("\nInfo Bombilla2");
		System.out.println("Interruptor: " + b2.isInterruptor());
		System.out.println("Estado bombilla: " + b2.isEstado());
		b2.mostrarEstado();

		b1.interruptorGeneral();

		System.out.println("Info Bombilla1");
		System.out.println("Interruptor: " + b1.isInterruptor());
		System.out.println("Estado bombilla: " + b1.isEstado());
		b1.mostrarEstado();

		System.out.println("\nInfo Bombilla2");
		System.out.println("Interruptor: " + b2.isInterruptor());
		System.out.println("Estado bombilla: " + b2.isEstado());
		b2.mostrarEstado();

		b1.interruptorGeneral();

		System.out.println("Info Bombilla1");
		System.out.println("Interruptor: " + b1.isInterruptor());
		System.out.println("Estado bombilla: " + b1.isEstado());
		b1.mostrarEstado();

		System.out.println("\nInfo Bombilla2");
		System.out.println("Interruptor: " + b2.isInterruptor());
		System.out.println("Estado bombilla: " + b2.isEstado());
		b2.mostrarEstado();
		
		b1.interruptorBombilla();
		
		System.out.println("Info Bombilla1");
		System.out.println("Interruptor: " + b1.isInterruptor());
		System.out.println("Estado bombilla: " + b1.isEstado());
		b1.mostrarEstado();

		System.out.println("\nInfo Bombilla2");
		System.out.println("Interruptor: " + b2.isInterruptor());
		System.out.println("Estado bombilla: " + b2.isEstado());
		b2.mostrarEstado();

	}

}
