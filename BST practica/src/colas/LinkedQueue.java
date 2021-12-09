package colas;
import excepciones.ExceptionEmpty;
import stacks.Node;

public class LinkedQueue <T> implements Queue <T>{
	protected Node <T> first; //primero
	protected Node <T> last; //ultimo

	public LinkedQueue() {
		this.first = null;
		this.last = null;
	}
	
	public void enqueue(T x) { //lo pone al final de lista enlazada
		Node <T> aux= new Node <T> (x);
		if (this.isEmpty())
			this.first = aux;
		else
			this.last.setNext(aux);
		this.last = aux;
	}

	@Override
	public T dequeue() throws ExceptionEmpty {
		if (this.isEmpty())  
			throw new ExceptionEmpty ("Cola vacia");
		T aux = this.first.getData();
		this.first=this.first.getNext(); //elimina, 1ro va ser 2do
		if (this.isEmpty()) 
			this.last = null;
		return aux;
	}

	@Override
	public T front() throws ExceptionEmpty {
		if (this.isEmpty())
			throw new ExceptionEmpty ("");
		return this.first.getData();
	}

	@Override
	public T back() throws ExceptionEmpty {
		if (this.isEmpty())
			throw new ExceptionEmpty ("Cola null");
		return this.last.getData();
	}

	@Override
	public boolean isEmpty() {
		return this.first == null; //primero es nulo = vacia
	}
	
	public String toString() {
		String str="Queue: ";
		if(this.isEmpty())
			str += "Vacio";
		else {
			for (Node <T> i= this.first; i!= null; i= i.getNext())
				str += i.toString() + ", ";
		}
		return str;
	}

}
