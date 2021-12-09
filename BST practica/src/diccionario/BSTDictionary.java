package diccionario;
import excepciones.ItemDuplicated;
import excepciones.ItemNotFound;
//c extends para claves

public class BSTDictionary<C extends Comparable<C>,V> implements Dictionary<C,V> {
	private BSTree<EntryDic<C,V>> bst; //arbol bst trabaja con entradas diccionario
	
	public BSTDictionary() {
		this.bst = new BSTree<EntryDic<C,V>>(); //creamos arbol y almacena en nodos entrada diccio
	}
	
	public void insert(C key, V value) throws ItemDuplicated {
		//compara nodos, por su clave 
		bst.insertRecu(new EntryDic<C,V>(key,value)); 
	}
	
	public void remove(C key) throws ItemNotFound {
		//busca clave por la entrada diccionario
		//con constructor (clave)
		bst.remove(new EntryDic<C,V>(key));
	}
	
	public V search(C key) throws ItemNotFound {
		return bst.search(new EntryDic<C,V>(key)).getValue();
	}
	
	public boolean isEmpty() { 
		return this.bst.isEmpty(); 
	}

	@Override
	public String toString() {
		return bst.toString();
	}
}
