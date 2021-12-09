package listas;

public class ListArray<T> implements ListTDA <T> {
	private T[] array;
	private int size;
	
	public ListArray(int n) {
		this.size = n;
		this.array= (T[]) new Object[n];
	}

	@Override
	public void insertFirst(T ele) { 
		if (isEmpty())
			this.array[0]=ele;
		else { 
			this.remove(array[this.lenght()]);
			array[0]=ele;
			for(int i=0; i<this.lenght();i++)
				array[i+1]=array[i];
		}
			
	}

	@Override
	public void insertLast(T ele) {
		if (this.isEmpty()) //lista vacia
			this.array[0] = ele;
		for(int i=0; i<this.lenght();i++)
			if (array[i]=)
		
				
		if (this.size != this.lenght()) //lista llena
			array[size] = ele;
		this.size++;
		}

		
	public void remove(T ele) {
		if (this.isEmpty()) //lista vacia
			this.toString();
		else {
			for(int i = 0; i<=this.lenght(); i++) {
				if(array[i].equals(ele))
					array[i]= null;
 			}
		}	
	}

	@Override
	public void initializeList() {
		for(int i=0; i<this.lenght(); i++)
			array[i]=null;
	}

	public boolean isEmpty() {
		return this.size==0;
	}
	
	@Override
	public boolean search(T ele) {
		boolean r= true;
		for(int i=0; i<this.lenght(); i++) {
			if (array[i].equals(ele))
				r=true;
			else r=false;
		}
		return r;
	}
	@Override
	public int lenght() {
		return this.array.length;
	}

	@Override
	public String toString() {
		String str="Lista: ";
		if(this.isEmpty())
			str += "Vacio";
		else {
			for (int i=0; i < array.length; i++)
				str += this.array[i]+ ", ";
		}
		return str;
	}

}
