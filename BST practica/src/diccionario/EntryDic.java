package diccionario;

//para almacenar en nodo
//con extends comparo claves
//con implements comparo entradas

public class EntryDic<C extends Comparable<C>,V> implements Comparable<EntryDic<C,V>> {
	private C key; //tipos genericos distintos, no siempre seran =
	private V value;
	
	public EntryDic(C key, V val) { 
		this.key = key; 
		this.value = val;
	}
	
	public EntryDic(C key) { 
		this(key, null); 
	}
	
	public C getKey() { return key; }
	public void setKey(C key) { this.key = key; }

	public V getValue() { return value; }
	public void setValue(V value) { this.value = value; }

	
	public boolean equals(Object x) {
		return ((EntryDic<C,V>)x).key.equals(this.key);
	}
	
	public int compareTo(EntryDic<C,V> x) {
		return this.key.compareTo(x.key); //comparo claves
	}
	
	public String toString() {
		return this.key + " => " + this.value+ "\n";
	}
}
