package stack;
import excepcion.ExceptionEmpty;

public class StackArray <E> implements Stack <E> {
	private int tope;
	private E[] array;
	private int maxSize;
	
	public StackArray(int n) {
		this.maxSize = n;
		this.tope = -1;
		this.array= (E[]) new Object[n];  //casteamos porque no se crea arreglos genericos
	}
	public void push(E x) { //agregar elementos a la pila
		if (!this.isFull()) //evealua si hay espacio
			array[++tope] = x; 	//top+1
	}

	@Override
	public E top() throws ExceptionEmpty { //muestra tope
		if (this.isEmpty())
			throw new ExceptionEmpty ("Pila vacia en top"); //lanzo excepcion con obj de clase exceptionempty
		return array[tope];
	}

	@Override
	public E pop() throws ExceptionEmpty { //igual que top pero elimina y muestra
		if (this.isEmpty())
			throw new ExceptionEmpty ("Pila vacia en top"); 
		//this.maxSize--;
		return array[--tope];
	}
	
	@Override
	public boolean isEmpty() {
		return this.tope == -1;
	}
	
	public boolean isFull() {
		return tope == this.maxSize-1;
	}
	
	@Override
	public String toString() {
		String str="Stack: ";
		if(this.isEmpty())
			str += "Vacio";
		else {
			for (int i=0; i <=this.tope; i++)
				str += this.array[i]+ ", ";
		}
		return str;
	}
	
}
