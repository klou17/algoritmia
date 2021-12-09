import java.util.EmptyStackException;

import bst_teo.Bst;
import excepciones.*;
public class Test {

	public static void main(String[] args) {
		Bst <Integer> b = new Bst <Integer> ();
		/*b.insertIte(20);
		b.insertIte(10);
		b.insertIte(14);
		b.insertIte(5);
		b.insertIte(1);
		b.insertIte(35);
		b.insertIte(28);
		b.insertIte(28);*/
		try {
		b.insertRecu(20);
		b.insertRecu(10);
		b.insertRecu(14);
		b.insertRecu(5);
		b.insertRecu(1);
		b.insertRecu(35);
		b.insertRecu(28);
		b.insertRecu(3);
		b.remove(20);
		System.out.println("altura total: " + b.alturaTotal());
		System.out.println("nro nodos total: " + b.nroNodos());
		System.out.println("nro nodos hojas: "+ b.nroHojas());
		System.out.println("nro nodos no hojas: "+ b.nroNodosNoHojas());
		System.out.println("area: " + b.area());
		
		//System.out.println("altura x: "+ b.alturaX(2));
		//System.out.println("maximo: " + b.predecesor());
		
		b.recorrido(1); //20,10,5,1,14,35,28
		b.recorrido(2); //1,5,10,14,20,28,35
		b.recorrido(3); //1,5,14,10,28,35,20
		//System.out.println(b.search(2));
		//b.minRemove();
		System.out.println("menor elemento: " +b.minRecover());
		System.out.println("elimina menor elemento: ");
		b.minRemove(); 
		b.recorrido(2);
		System.out.println("mayor elemento: " +b.maxRecover()); 
		System.out.println("elimina mayor elemento: ");
		b.maxRemove(); 
		b.recorrido(1);
		b.preordenIte();
		
		}
		catch (ItemDuplicated e ) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}
		
		catch (ItemNotFound e ) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}
		
		catch (EmptyStackException e ) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}
		
	}

}
