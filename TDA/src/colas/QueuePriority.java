package colas;
import java.util.ArrayList;

import excepcion.ExceptionEmpty;

//al insertar el nuevo va ser el ultimo
//si no hay cola la crea

public class QueuePriority <T> {
	private ArrayList <LinkedQueue<T>> arrPrio; 
	private int nPrio;
	private int count;

	public QueuePriority(int n) {
		this.nPrio=n;
		this.count=0;
		this.arrPrio = new ArrayList <LinkedQueue<T>> (this.nPrio);
		for (int i=0; i<this.nPrio; i++)
			this.arrPrio.add(new LinkedQueue<T>()); //creamos colas vacias
			//this.arrPrio.add(null);
		this.count =0;
	}
	
	public void enqueue(T x, int p) { //suponemos prioridad correcta
		/*if(this.arrPrio.get(p-1) == null) //cola no existe, creamos nueva cola
			this.arrPrio.set(p-1, new ArrayQueue <T> (5));
		this.arrPrio.get(p-1).enqueue(x);*/
		
		/*if(this.arrPrio.get(p-1) == null) //si la posicion tiene una cola creada
			this.arrPrio.set(p-1, new LinkedQueue<T> ()); //creamos cola*/
		
		
		//como ya creamos colas vacias ya no hay necesidad del if de arriba
		//solo insertamos
		this.arrPrio.get(p-1).enqueue(x); //enqueue del linkqueue
		this.count ++;
	}

	public T dequeue() throws ExceptionEmpty {
		T item = null;
		if(this.isEmpty())
			throw new ExceptionEmpty ("cola de prioridad vacia");
		
		for (int i=0; i< this.nPrio; i++) { //empezamos con cola de mas alta prioridad
			if (!this.arrPrio.get(i).isEmpty()) { //si cola no esta vacia ya tengo elemento a sacar
				item= this.arrPrio.get(i).dequeue();
				break;
			}	
		}
		this.count--;
		return item;
	}

	public T front() throws ExceptionEmpty {
		T item = null;
		if(this.isEmpty())
			throw new ExceptionEmpty ("cola de prioridad vacia");

		for (int i=0; i< this.nPrio; i++) {
			if (!this.arrPrio.get(i).isEmpty()) { //si no esta vacia
			//if (this.arrPrio.get(i) !=null)	{
				item= this.arrPrio.get(i).front(); 
				break;
			}	
		}
		return item;
	}

	public T back() throws ExceptionEmpty {
		T item = null;
		if(this.isEmpty())
			throw new ExceptionEmpty ("cola de prioridad vacia");
		
		for (int i=this.nPrio-1; i>=0; i--) {
			//if (this.arrPrio.get(i).isEmpty()) { //si es diferente de null ya tengo elemento a sacar
			if (this.arrPrio.get(i) !=null) {	
				item= this.arrPrio.get(i).back();
				break;
			}	
		}
		return item;
	}

	public boolean isEmpty() {
		/*for (int i=0; i<= this.nPrio-1 ; i++) {
			if (this.arrPrio.get(i) !=null ) { //si es diferente de null ya tengo elemento a sacar
				return true;
			}	
		}
		return false;*/
		
		if(this.count==0)
			return true;
		return false;
	}


	@Override
	public String toString() {
		String str="";
		for(int i=0; i< this.nPrio; i++) {
			if (this.arrPrio.get(i) != null)
			str += "Prioridad "+ (i+1) +": "+this.arrPrio.get(i).toString()+ "\n";
		}
		return str;
	}
	
	
}
