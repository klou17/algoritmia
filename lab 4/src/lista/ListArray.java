package lista;

public class ListArray<T> implements ListTDA <T> {
	private T[] array;
	private int size;
	
	public ListArray(int n) {
		this.size = n;
		this.array= (T[]) new Object[n];
	}

	@Override
	public int length() {
		return this.array.length;
	}

	@Override
	public void insertFirst(T ele) {
		if (!(isEmptyList()))
			for (int i=0; i<=this.length(); i++)
				array[i]=array[i+1];
		else
			this.array[0]=ele;
	}

	@Override
	public void insertLast(T ele) {
		if (this.isEmptyList()) //lista vacia
			this.insertFirst(ele);
		if (this.sizeArray != this.maxSize) //lista llena
			array[sizeArray] = ele;
		this.sizeArray++;
	}

	private void destroyList () {}
	
	public void remove(T ele) {
		if (this.isEmptyList()) //lista vacia
			this.toString();
		/*else {
			for(int i = 0; i < sizeArray; i++) {
		}
            if(array[i].equals(ele)) {
                remove(i);*/

	}

	@Override
	public void initializeList() {
		this.destroyList();
	}

	@Override
	public boolean isEmptyList() {
		return this.length()==0;
	}
	
	@Override
	public boolean search(T ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		String str="Lista: ";
		if(this.isEmptyList())
			str += "Vacio";
		else {
			for (int i=0; i <=this.length(); i++)
				str += this.array[i]+ ", ";
		}
		return str;
	}

}
