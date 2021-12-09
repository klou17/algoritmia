
import diccionario.*;
import excepciones.*;

public class TestProducto {
	public static void main(String[] args) {
		BSTree <Producto> producto= new BSTree <Producto> ();
		Producto p1= new Producto ("lapiz",5, 3);
		Producto p2=new Producto ("borrador",5, 23);
		Producto p3=new Producto ("libro",20, 13);
		Producto p4=new Producto ("papel",2, 10);
		Producto p5=new Producto ("calculadora", 14, 5);
		Producto p6=new Producto ("botella", 10, 2);
		Producto p7=new Producto ("tajador", 0.3, 1);
		try {
			producto.insertRecu(p1);
			producto.insertRecu(p2);
			producto.insertRecu(p3);
			producto.insertRecu(p4);
			producto.insertRecu(p5);
			producto.insertRecu(p6);
			producto.insertRecu(p7);
			System.out.println(producto.productoPorTerminar(p2));		
		}
		
		catch (ItemDuplicated e ) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static <E extends Comparable <E>> boolean areasArboles(BSTree <E> arbolB, BSTree <E> arbolC) {
		return arbolB.area() == arbolC.area();
	}
}
