package lista;
import node.Node;

public class ListLinked <T> implements ListTDA <T>  {
	private Node <T> head;
	private int count;
	
	public ListLinked() {
		this.head = null;
		this.count=0;
	}

	@Override
	public int length() {
		return this.count;
	}

	public boolean search(T ele) { 
     	Node <T> aux= this.head;
		//el while acaba cuando encuentra el elemento o no lo encuentra
		//si no lo encuentra el ultimo elemento es null
		while (aux !=null && !aux.getData().equals(ele))
			aux=aux.getNext();
		
		if (aux==null) //no encontro el elemento
			return false;
		return true;
	}
	
	public void remove(T ele) {
		//cuando la lista esta vacia
		if (this.isEmptyList()) 
			this.toString();
		else {
			//elemento al inicio
			if (this.head.getData().equals(ele))
				this.head=this.head.getNext();
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

	@Override
	public void insertFirst(T ele) {
		/*Node nuevo= new Node(ele);
		nuevo.setNext(this.head);
		this.head = nuevo;*/
		this.head=new Node(ele,this.head);
		this.count ++;
	}
	
	@Override
	public void insertLast(T ele) {
		//cuando la lista esta vacia lo coloca en la cabeza
		if (this.isEmptyList()) //el this en este conexto apunta a la lista
			this.insertFirst(ele);
		
		//cuando la lista ya tiene elementos, recorro la lista
		else {
			Node<T> aux=this.head;
			while(aux.getNext()!=null)
				aux=aux.getNext(); //recorro hasta que siguiente sea nulo
			
			/*Node<T> nuevo=new Node<T> (ele);
			aux.setNext(nuevo); //lo ingresa*/
			aux.setNext(new Node<T> (ele));
			this.count ++;
		}
	}

	@Override
	public void initializeList() {
		this.destroyList();
	}

	@Override
	public boolean isEmptyList() {
		return this.head == null;
	}

	@Override
	public String toString() {
		String cad="";
		for (Node<T> aux=this.head; aux !=null; aux=aux.getNext())
			cad=cad+ aux.toString()+ ", ";
		return cad;
	}
	
	private void destroyList() { //saca nodo a nodo hasta deshacerme de todos los nodos
		while (this.head !=null) { //si existe o no la cabeza
			//Node <T> aux=this.head;
			this.head=this.head.getNext(); 
			//delete(aux) devuelvo espacio de memoria ocupado por aux
			this.count=0; 
		}
	}

	public Node<T> getHead() { return head; }

	public int getCount() { return count; }

	public void setHead(Node<T> head) {	this.head = head; }

	public void setCount(int count) { this.count = count; }

}
