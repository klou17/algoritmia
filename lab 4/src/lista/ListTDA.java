package lista;

public interface ListTDA <T> {
	int length(); 				//determina la cantidad (longitud) de elementos que hay en la lista
	void initializeList();		//inicializa la lista enlazada en estado vac�o
	boolean isEmptyList(); 		//verifica si la lista est� vac�a
	boolean search(T ele); 	//verifica si un elemento est� o no en la lista
	void insertFirst(T ele);	//inserta un nuevo elemento al inicio de la lista
	void insertLast(T ele); 	//inserta un nuevo elemento al final de la lista
	//void remove(T ele);			//elimina un elemento de la lista.
	//destroyList();  			//elimina los elementos de la lista dej�ndola vac�a
}
