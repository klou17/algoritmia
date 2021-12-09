
public class ListLinked <T extends Comparable <T>> implements ListTDA <T>{
	protected Node <T> head;
	protected int count;
	
	public ListLinked() {
		this.head = null;
		this.count = 0;
	}

	@Override
	public void initializeList() { //borro todo para inicializar
		this.destroyList();
	}

	private void destroyList() { 
		//recoge espacios memoria 
		while (this.head != null) //saca nodo a nodo hasta deshacerse de todos
			//Node <T> aux =this.head;
			this.head = this.head.getNext(); // 2do se hace primero y esta desenlazado
			//delete (aux);
		this.count = 0;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public int lenght() {
		return this.count;
	}

	@Override
	public boolean search(T ele) { 
		//recorrer toda la lista para busqueda
		Node <T> aux= this.head;
		while (aux != null && !aux.getData().equals(ele)) 
			//si existe o no el nodo
			//y el dato encontrado no se =, si es = ya lo encontre
			aux=aux.getNext(); //me muevo al siguiente nodo
		if (aux==null) //no encontre el ele
			return false;
		return true; //si lo encontre
	}

	@Override
	public void insertFirst(T ele) {
		this.head = new Node <T> (ele, this.head);
		this.count ++;
	}
	
	@Override
	public void insertLast(T ele) {
		if (this.isEmpty()) //en este contexto es la lista
			//la lista esta vacia, es la cabeza
			this.insertFirst(ele); 
		else {
			Node <T> aux= this.head; 
			//lista por lo menos tiene un nodo
			while (aux.getNext() != null) //recorrer lista hasta encontrar nodo cuyo siguiente es null
				aux=aux.getNext();
			//Node <T> nuevo= new Node <T> (ele);
			//aux.setNext(nuevo);
			
			aux.setNext(new Node <T> (ele));
			this.count ++;
		}		
	}
	
	public void remove(T ele) {
		if (this.isEmpty()) //cuando la lista esta vacia
			this.toString();
		else {
			if (this.head.getData().equals(ele)) //ele es el 1er nodo
				this.head=this.head.getNext(); //el siguiente seria la cabeza
			else {
				//cualquier ubicacion menos primera
				Node<T> aux=this.head;
				while (aux.getNext().getData() !=ele)
					aux=aux.getNext();
				aux.setNext(aux.getNext().getNext());
			}
		}
		this.count --;
	}
	
	public void menores(T ele) {
		if (this.isEmpty()) //cuando la lista esta vacia
			this.toString();
		
		Node <T> aux= this.head;
		while(aux.getNext() !=null) {
			while(ele.compareTo(aux.getData()) < 0)
				aux=aux.getNext();
			aux=aux.getNext();
			System.out.print(aux.getData()+", ");
		}
	}
	
	@Override
	public String toString() {
		String cad = "Lista: ";
		if (this.isEmpty())
			cad= cad+ "vacia";
		else {
			for (Node<T> aux=this.head; aux !=null; aux=aux.getNext())
				cad=cad+ aux.toString()+ ", ";
		}
		return cad;
	}

}
