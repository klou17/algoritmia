package lista;

import node.Node;

//cambia insert, remove y search
// lo demas lo heredo de clase ListLinked
public class OrderListLinked <T extends Comparable <T>> extends ListLinked<T>{
	public OrderListLinked() {
		super ();
	}
	
	public boolean search(T ele) { //redefinir
		Node<T> aux = this.getHead();    //probar    
		while (aux != null && aux.getData().compareTo(ele) < 0 )           
			 aux = aux.getNext(); 
		if(aux != null)                 
		    return aux.getData().equals(ele);
		return false;
	}
	
	public void insert(T ele) {
		Node<T> aux = this.getHead();    //probar    
		while (aux != null && aux.getData().compareTo(ele) < 0 )           
			 aux = aux.getNext(); 
		
	}
	
	public void remove(T ele) {
		Node<T> aux = this.getHead();
		if (this.isEmptyList())  //vacio
			this.toString();
		else {
			if (aux.getData().compareTo(ele) < 0)
				aux=aux.getNext();
				aux.setNext(aux.getNext().getNext());
			}
		}

}
