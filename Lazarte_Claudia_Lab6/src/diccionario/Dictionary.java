package diccionario;
import excepciones.ItemDuplicated;
import excepciones.ItemNotFound;

public interface Dictionary <C, V> {
	void insert(C key, V val) throws ItemDuplicated;
	void remove(C key) throws ItemNotFound;
	V search(C key) throws ItemNotFound;
	boolean isEmpty();
}
