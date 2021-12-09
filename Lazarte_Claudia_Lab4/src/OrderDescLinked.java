
public class OrderDescLinked <T extends Comparable <T>> extends ListLinked<T> {

	public OrderDescLinked() {
		super();
	}
	
	public void insert(T ele) {
		Node <T> aux= this.head;
		Node <T> nuevo= new Node <T>(ele);
		Node <T> anterior = null;
		
		if (this.isEmpty()) //vacia inserto al inicio
			insertFirst(ele);
		
		while (aux != null && aux.getData().compareTo(ele) > 0) {
			anterior=aux;
			aux= aux.getNext();
		}
		if(anterior==null)
			this.head=nuevo;
		else
			anterior.setNext(nuevo);
		nuevo.setNext(aux);	
	}

}
