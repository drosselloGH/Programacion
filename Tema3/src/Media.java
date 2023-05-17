
public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//mostrar los argumentos que recibe el programa
		System.out.println("Argumentos recibidos por el programa");
		int sumaTotal = 0;
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			sumaTotal += Integer.parseInt(args[i]);
		}
		System.out.println("La suma total es: "+sumaTotal);
		
		System.out.println("Media: "+sumaTotal / args.length);

	}

}
