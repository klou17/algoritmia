package colas;
import excepcion.ExceptionEmpty;

//array circular, se une fin con la cabeza
//no se desplazan elementos
//puedes hacer copia del array a otro para agrandar el size sino arit mod
public class ArrayQueue <T> implements Queue <T> {
	private int size;
    private T[] array;
    private int back; //last
    private int front; //first 
    private int count;

	public ArrayQueue(int size) {
		this.size = size;
		this.array= (T[]) new Object[size];
		this.back = -1;
		this.front = 0;	
	}

	public void enqueue2(T x) { 
		if(isEmpty())
			this.array[front]= x; 
		else 
			this.back = siguiente(back);
			this.array[this.back] = x;
		this.count ++;
	}
	
	public void enqueue(T x) { 
		if (!this.isFull()) {
			this.back = (this.back + 1) % this.size;
			this.array[back] = x;
			this.count++;
		}
		else
			System.out.println("Cannot add to a full queue");
	}
	

	public T dequeue2() throws ExceptionEmpty {
		if(!(isEmpty())) {
			T aux= array[front];
			this.front= siguiente(front);
			this.count--;
			return aux;
		}
		else throw new ExceptionEmpty("vacio" );
	}
	
	public T dequeue() throws ExceptionEmpty {
		if (isEmpty())
			throw new ExceptionEmpty("Cannot remove from an empty queue");
		this.count--;
		T ele = array[this.front];
		this.front = (this.front + 1) % this.size; //usamos arit mod porq es arreglo circular
		return ele;
	}

	@Override
	public T front() throws ExceptionEmpty {
		if(this.isEmpty()) 
			throw new ExceptionEmpty("vacio" );
		return this.array[this.front];
	}

	@Override
	public T back() throws ExceptionEmpty {
		if(this.isEmpty())
			throw new ExceptionEmpty("cola vacia");
		return this.array[this.back];

	}
	private int siguiente (int s) {
		return (s+1) % this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.count == 0;
	}
	
	public boolean isFull() {
		return this.count == this.size;
	}

	@Override
	public String toString() {
		String str="Cola: ";
		/*if(this.isEmpty())
			str += "Vacio";
		else {
			for (int i=0; i <array.length; i++) {
				if (array[i] != null)
					str += this.array[i]+ ", ";
			}
		}*/
		int pos= this.front;
		for (int i=1; i<=this.count; i++) {
			str += this.array[pos] + ", ";
			pos= (pos+1) % this.size;
		}
		return str;
	}

}
