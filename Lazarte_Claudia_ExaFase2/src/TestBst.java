import java.util.EmptyStackException;

import excepciones.*;

public class TestBst {
	public static void main(String[] args) {
		BSTree <Integer> b= new BSTree <Integer> ();
		BSTree <Integer> c= new BSTree <Integer> ();
		/*b.insertIte(20);
		b.insertIte(10);
		b.insertIte(14);			
		b.insertIte(1);
		b.insertIte(35);
		b.insertIte(28);
		b.insertIte(3);*/
		try {
			b.insertRecu(25);
			b.insertRecu(10);
			b.insertRecu(1);
			b.insertRecu(16);
			b.insertRecu(13);
			b.insertRecu(22);
			b.insertRecu(15);
			b.insertRecu(28);
			b.insertRecu(29);
			System.out.println(b.descendientes(10));
			
		}
		
		catch (ItemDuplicated e ) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}
		

	}
	
	public static <E extends Comparable <E>> boolean areasArboles(BSTree <E> arbolB, BSTree <E> arbolC) {
		return arbolB.area() == arbolC.area();
	}
}
