package colas;
import excepcion.ExceptionEmpty;
import nodo.Node;

public class DobleQueue <T> extends LinkedQueue <T>  {
	private int cont;
	
	public DobleQueue() {
		super();
		this.cont=0;
	}
	
	public void agregarFrente(T x) {
		Node <T> aux= new Node <T> (x);
		if (this.isEmpty())
			this.first = aux;
		else
			aux.setNext(this.first);
		this.first = aux;
		this.cont++;
	}
	
	public void agregarFinal(T x) {
		this.enqueue(x);
		this.cont++;
	}
	
	public T removerFrente() throws ExceptionEmpty {
		this.cont--;
		return this.dequeue();
	}
	
	public T removerFinal() throws ExceptionEmpty {
		Node <T> aux = this.first;
		if (this.isEmpty())  
			throw new ExceptionEmpty ("Cola vacia");
		else {
			while (aux.getNext() != this.last) //hasta penultimo
				aux=aux.getNext();
			this.last=aux;
			this.last.setNext(null); //su siguiente es nulo
			T rem = this.last.getData();
			this.cont--;
			return rem;
		}
	}

	public boolean isEmpty() {
		return this.cont==0;
	}
	
	public int tamano() {
		return this.cont;
	}

}
