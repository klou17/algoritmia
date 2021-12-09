package stack;
import excepcion.ExceptionEmpty;
import node.Node;

public class StackLink<T> implements Stack<T> {
	Node <T> head;

	public StackLink() { 
		this.head =null; 
	}
	
	
	public boolean isEmpty() { 
		return this.head == null; 	
	}
	
	public void push(T x) { 
		this.head = new Node <T> (x, this.head); 
	}

	public T pop() throws ExceptionEmpty {
		if (!(this.isEmpty())) {
			this.head= this.head.getNext();	
			T aux= this.head.getData();
			return aux;
		}
		else 
			throw new ExceptionEmpty ("Pila vacia en top");
	}

	@Override
	public T top() throws ExceptionEmpty {
		if (this.isEmpty())
			throw new ExceptionEmpty ("Pila vacia en top");
		return this.head.getData();
	}
	
	public String toString() {
		String str="Stack: ";
		if(this.isEmpty())
			str += "Vacio";
		else {
			for (Node <T> i= this.head; i!= null; i.getNext())
				str += i.toString() + ", ";
		}
		return str;
	}

}
