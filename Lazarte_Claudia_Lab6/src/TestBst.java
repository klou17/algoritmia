import java.util.EmptyStackException;

import diccionario.*;
import stacks.*;
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
			b.insertRecu(20);
			b.insertRecu(10);
			b.insertRecu(14);
			b.insertRecu(5);
			b.insertRecu(1);
			b.insertRecu(35);
			b.insertRecu(28);
			System.out.println(b.search(10));

			c.insertRecu(10);
			c.insertRecu(80);
			c.insertRecu(4);
			c.insertRecu(5);
			c.insertRecu(1);
			c.insertRecu(3);
			c.insertRecu(18);
			c.insertRecu(43);
			
			//System.out.println(b);
			System.out.println(c);
			c.remove(5); //hoja
			c.remove(10); //raiz
			c.remove(4); //padre
			System.out.println(c);
			
			
			System.out.println("altura total: " + b.alturaTotal());
			System.out.println("nro nodos total: " + b.nroNodos());
			System.out.println("nro nodos hojas: "+ b.nroHojas());
			System.out.println("nro nodos no hojas: "+ b.nroNodosNoHojas());
			System.out.println("area B: " + b.area());
			System.out.println("area C: " + c.area());
			
			System.out.println(b);
			System.out.println("menor elemento: " +b.minRecover());
			System.out.println("elimina menor elemento: ");
			b.minRemove(); 
			System.out.println(b);
			System.out.println("mayor elemento: " +b.maxRecover()); 
			System.out.println("elimina mayor elemento: ");
			b.maxRemove(); 
			System.out.println(b);
			
			System.out.println("arbol B y C tienen areas iguales? "+ areasArboles(b,c));
			b.preOrdenIte();
			//System.out.println(b.alturaX(20));
		}
		
		catch (ItemDuplicated e ) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}
		
		
		catch (ItemNotFound e ) { 
			System.out.println(e.getMessage());
		}
		
		
		catch (ExceptionEmpty e ) { 
			System.out.println(e.getMessage());
		}
	}
	
	public static <E extends Comparable <E>> boolean areasArboles(BSTree <E> arbolB, BSTree <E> arbolC) {
		return arbolB.area() == arbolC.area();
	}
}
