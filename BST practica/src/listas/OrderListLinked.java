package listas;
import stacks.Node;


public class OrderListLinked <T extends Comparable <T>> extends ListLinked<T> {

	public OrderListLinked() {
		super();
	}

	public boolean search(T ele) {
		Node <T> aux= this.head;
		while (aux != null && aux.getData().compareTo(ele) < 0) //aux menor a ele sino sale
			aux = aux.getNext();	
	     if(aux != null)    //aux si existe y recien compara igualdad          
	    	 return aux.getData().equals(ele);
	     return false; //aux es nulo y no existe
	}
	
	public void insert(T ele) {
		Node <T> aux= this.head;
		Node <T> nuevo= new Node <T>(ele);
		Node <T> anterior = null;
		
		if (this.isEmpty()) //vacia inserto al inicio
			insertFirst(ele);
		
		while (aux != null && aux.getData().compareTo(ele) < 0) {
			anterior=aux;
			aux= aux.getNext();
		}
		if(anterior==null)
			this.head=nuevo;
		else
			anterior.setNext(nuevo);
		nuevo.setNext(aux);	
	}
	
	public void remove (T ele) {
		if (this.isEmpty()) //vacio, no hay nada que eliminar
			this.toString();
		 //hay un elemento por lo menos
		Node <T> aux= this.head;
		Node <T> nuevo= null;
		while (aux.getData().compareTo(ele) < 0) {
			nuevo = aux;
			aux = aux.getNext();
		}
		if (aux.getData().equals(ele))
			nuevo.setNext(aux.getNext());
	}	

}
