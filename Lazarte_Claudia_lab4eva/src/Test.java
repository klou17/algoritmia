
import colas.DobleQueue;
import excepcion.ExceptionEmpty;

public class Test {
	public static void main(String[] args) {
		DobleQueue <Integer> q1 = new DobleQueue <Integer> ();
		try {
			q1.agregarFinal(5);
			System.out.println(q1);
			q1.agregarFinal(3);
			System.out.println(q1);
			q1.agregarFrente(10);
			System.out.println(q1);
			q1.agregarFrente(13);
			System.out.println(q1);
			q1.agregarFinal(2);
			System.out.println(q1);
			q1.removerFrente();
			System.out.println(q1);
			q1.removerFinal();
			System.out.println(q1);
			System.out.println("Frente:" + q1.front());
			System.out.println("Final: " + q1.back());
			System.out.println("Tamano: " +q1.tamano());
		}
				
		catch (ExceptionEmpty e) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}
		
	}
}

