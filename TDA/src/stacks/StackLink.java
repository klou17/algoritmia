package stacks;

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
		if (this.isEmpty()) 
			throw new ExceptionEmpty ("Pila vacia en top");
		else {
			this.head= this.head.getNext();	//el siguiente 
			T aux= this.head.getData();
			return aux;
		}	
	}

	@Override
	public T top() throws ExceptionEmpty { 
		if (this.isEmpty())
			throw new ExceptionEmpty ("Pila vacia en top lista");
		return this.head.getData(); //devuelvo primer elemento
	}
	
	public String toString() {
		String str="Stack: ";
		if(this.isEmpty())
			str += "Vacio";
		else {
			for (Node <T> i= this.head; i!= null; i= i.getNext())
				str += i.toString() + ", ";
		}
		return str;
	}

}
